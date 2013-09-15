package si.kcclass.bbmonbackend

import javax.sql.DataSource;
import grails.converters.JSON;
import groovy.sql.Sql

class DevicesController {
	
	DataSource dataSource
	
	def getMonSys() {
		def sql = new Sql(dataSource)
		List monSys = []
		sql.eachRow("select distinct mon_sys_id, mon_sys_name from vDevices") { row ->
			monSys.add([ 'mon_sys_id': row['mon_sys_id'], 'mon_sys_name': row['mon_sys_name'] ])
		}
		sql.close();
		render monSys as JSON
	}
	
	def getMonSysCustomer(int monSysId) {
		def sql = new Sql(dataSource)
		List monSysCustomers = []
		sql.eachRow("select distinct mon_sys_customer from vDevices where mon_sys_id=:monSysId", 
			['monSysId': monSysId]) { row ->
			monSysCustomers.add(['mon_sys_customer': row['mon_sys_customer']])
		}
		sql.close();
		render monSysCustomers as JSON
	}
	
	def getDev(int monSysId, int monSysCustomer) {
		def sql = new Sql(dataSource)
		List devices = []
		sql.eachRow("select distinct dev_id, dev_name from vDevices where mon_sys_id=:monSysId and mon_sys_customer=:monSysCustomer",
			['monSysId': monSysId, 'monSysCustomer': monSysCustomer]) { row ->
			devices.add(['dev_id': row['dev_id'], 'dev_name': row['dev_name']])
		}
		sql.close();
		render devices as JSON
	}
	
	def getMetrics(int monSysId, int monSysCustomer, int devId) {
		def sql = new Sql(dataSource)
		List metrics = []
		sql.eachRow("select distinct met_id, met_name, event_status_color from vDevices " +
			"join vPresentStatus on event_mon_sys_id=mon_sys_id and event_customer_id=mon_sys_customer and event_device_id=dev_id and event_metric_id=met_id " +
			"where mon_sys_id=:monSysId and mon_sys_customer=:monSysCustomer and dev_id=:devId",
			['monSysId': monSysId, 'monSysCustomer': monSysCustomer, 'devId': devId]) { row ->
			metrics.add(['met_id': row['met_id'], 'met_name': row['met_name'], 'color': row['event_status_color']])
		}
		sql.close();
		render metrics as JSON
	}

}
