package si.kcclass.bbmonbackend

import javax.sql.DataSource;

import grails.converters.JSON;
import groovy.sql.Sql

class DevicesController extends GroovyTestCase {
	
	DataSource dataSource
	
	def getMonSys() {
		def sql = new Sql(dataSource)
		List monSys = []
		sql.eachRow("select distinct mon_sys_id, mon_sys_name from vDevices") { row ->
			monSys.add([ 'mon_sys_id': row['mon_sys_id'], 'mon_sys_name': row['mon_sys_name'] ])
		}
		render monSys as JSON
	}
}
