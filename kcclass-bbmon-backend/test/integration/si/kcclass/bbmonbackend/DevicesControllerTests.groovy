package si.kcclass.bbmonbackend



import grails.test.mixin.*
import groovy.sql.Sql;
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(DevicesController)
class DevicesControllerTests extends GroovyTestCase {

	File schemaDump
	Sql sql
	def dataSource

	public void setUp() {
		super.setUp()
		executeSqlScript("/data/vdevices.sql")
		executeSqlScript("/data/vpresentstatus.sql")
	}
	
	private void executeSqlScript(String sqlScript) {
		String sqlFilePath = servletContext.getRealPath(sqlScript)
		String sqlString = new File(sqlFilePath).text
		def sql = new Sql(dataSource)
		sql.execute(sqlString)
	}
	
	void testGetMonSys() {
		controller.getMonSys()
		assert response.text == '[{"mon_sys_id":14,"mon_sys_name":"monitoring_system"}]'
	}
	
	void testGetMonSysCustomer() {
		controller.getMonSysCustomer(14)
		assert response.text == '[{"mon_sys_customer":13}]'
	}
	
	void testGetDev() {
		controller.getDev(14, 13)
		assert response.text == '[{"dev_id":14139,"dev_name":"localhost"},{"dev_id":14138,"dev_name":"localhost"}]'
	}
	
	void testGetMetrics() {
		controller.getMetrics(14, 13, 14139)
		assert response.text == '[{"met_id":2971,"met_name":"xymongen","color":"green"},{"met_id":2972,"met_name":"conn","color":"green"},{"met_id":2973,"met_name":"bbd","color":"green"}]'
	}
}
