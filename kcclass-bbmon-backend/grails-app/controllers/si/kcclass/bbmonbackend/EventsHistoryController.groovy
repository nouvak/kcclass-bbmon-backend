package si.kcclass.bbmonbackend

import javax.sql.DataSource;
import grails.converters.JSON;
import groovy.sql.Sql

class EventsHistoryController {
	
	DataSource dataSource

	def getEventsHistory(int monSysId, int monSysCustomer, int devId, int metricId) {
		def sql = new Sql(dataSource)
		List eventsHistory = []
		sql.eachRow("select event_unixtime, status, prev_status from vEventsHistory where " +
			"monitoring_system_id=:monSysId and customer_id=:monSysCustomer " +
			"and device_id=:devId and metric_id=:metricId",
			['monSysId': monSysId, 'monSysCustomer': monSysCustomer, 'devId': devId, 
				'metricId': metricId]) { row ->
			eventsHistory.add(['event_unixtime': row['event_unixtime'], 
				'status': row['status'], 'prev_status': row['prev_status']])
		}
		sql.close();
		render eventsHistory as JSON
	}
	
}
