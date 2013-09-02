package si.kcclass.bbmonbackend

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class Vdevices implements Serializable {

	Integer monSysId
	String monSysName
	String monSysDesc
	String monSysIp
	String monSysDns
	String monSysUrl
	Integer monSysCustomer
	Integer devId
	String devName
	String devDesc
	String devIp
	Integer metId
	String metName
	String metDesc

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append monSysId
		builder.append monSysName
		builder.append monSysDesc
		builder.append monSysIp
		builder.append monSysDns
		builder.append monSysUrl
		builder.append monSysCustomer
		builder.append devId
		builder.append devName
		builder.append devDesc
		builder.append devIp
		builder.append metId
		builder.append metName
		builder.append metDesc
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append monSysId, other.monSysId
		builder.append monSysName, other.monSysName
		builder.append monSysDesc, other.monSysDesc
		builder.append monSysIp, other.monSysIp
		builder.append monSysDns, other.monSysDns
		builder.append monSysUrl, other.monSysUrl
		builder.append monSysCustomer, other.monSysCustomer
		builder.append devId, other.devId
		builder.append devName, other.devName
		builder.append devDesc, other.devDesc
		builder.append devIp, other.devIp
		builder.append metId, other.metId
		builder.append metName, other.metName
		builder.append metDesc, other.metDesc
		builder.isEquals()
	}

	static mapping = {
		id composite: ["monSysId", "monSysName", "monSysDesc", "monSysIp", "monSysDns", "monSysUrl", "monSysCustomer", "devId", "devName", "devDesc", "devIp", "metId", "metName", "metDesc"]
		version false
	}

	static constraints = {
		monSysName maxSize: 100
		monSysDesc nullable: true, maxSize: 1024
		monSysIp maxSize: 50
		monSysDns maxSize: 100
		monSysUrl maxSize: 100
		devName maxSize: 100
		devDesc nullable: true, maxSize: 1024
		devIp nullable: true, maxSize: 50
		metName maxSize: 100
		metDesc nullable: true, maxSize: 1024
	}
}
