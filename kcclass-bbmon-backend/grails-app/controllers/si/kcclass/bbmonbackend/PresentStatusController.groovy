package si.kcclass.bbmonbackend

import javax.sql.DataSource;
import grails.converters.JSON;
import groovy.sql.Sql

class PresentStatusController {

	DataSource dataSource

	def getPresentStatus(int monSysId, int monSysCustomer, int devId, int metricId) {
		def sql = new Sql(dataSource)
		Map presentStatus
		sql.eachRow("select event_time, event_status from vPresentStatus where " +
			"event_mon_sys_id=:monSysId and event_customer_id=:monSysCustomer " +
			"and event_device_id=:devId and event_metric_id=:metricId",
			['monSysId': monSysId, 'monSysCustomer': monSysCustomer, 'devId': devId, 
				'metricId': metricId]) { row ->
			presentStatus = ['event_unixtime': row['event_time'], 
				'status': row['event_status']]
		}
		sql.close();
		render presentStatus as JSON
	}

}
