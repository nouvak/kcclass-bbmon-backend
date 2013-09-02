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
		String sqlFilePath = servletContext.getRealPath("/data/vdevices.sql")
		String sqlString = new File(sqlFilePath).text
		def sql = new Sql(dataSource)
		sql.execute(sqlString)
	}
	
	void testGetMonSys() {
		controller.getMonSys()
		assert response.text == '[{"mon_sys_id":14,"mon_sys_name":"monitoring_system"}]'
	}
}
