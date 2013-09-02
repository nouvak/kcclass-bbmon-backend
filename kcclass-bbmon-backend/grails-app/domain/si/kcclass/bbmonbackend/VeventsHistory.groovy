package si.kcclass.bbmonbackend

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class VeventsHistory implements Serializable {

	Integer id
	Date timestamp
	Integer year
	Integer month
	Integer day
	Integer hour
	Long eventUnixtime
	Integer customerId
	Integer monitoringSystemId
	Integer deviceId
	Integer metricId
	Integer status
	Integer acknowledgeId
	Boolean messageSent
	Boolean userDeleted
	Integer clientId
	Integer duration
	Integer prevStatus
	Long prevEventUnixtime
	String sender
	String origin
	Long expiretime
	String color
	String prevcolor
	Long changetime
	Long disabletime
	String disablemsg
	Long downtimeactive
	Long clienttstamp

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append id
		builder.append timestamp
		builder.append year
		builder.append month
		builder.append day
		builder.append hour
		builder.append eventUnixtime
		builder.append customerId
		builder.append monitoringSystemId
		builder.append deviceId
		builder.append metricId
		builder.append status
		builder.append acknowledgeId
		builder.append messageSent
		builder.append userDeleted
		builder.append clientId
		builder.append duration
		builder.append prevStatus
		builder.append prevEventUnixtime
		builder.append sender
		builder.append origin
		builder.append expiretime
		builder.append color
		builder.append prevcolor
		builder.append changetime
		builder.append disabletime
		builder.append disablemsg
		builder.append downtimeactive
		builder.append clienttstamp
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append id, other.id
		builder.append timestamp, other.timestamp
		builder.append year, other.year
		builder.append month, other.month
		builder.append day, other.day
		builder.append hour, other.hour
		builder.append eventUnixtime, other.eventUnixtime
		builder.append customerId, other.customerId
		builder.append monitoringSystemId, other.monitoringSystemId
		builder.append deviceId, other.deviceId
		builder.append metricId, other.metricId
		builder.append status, other.status
		builder.append acknowledgeId, other.acknowledgeId
		builder.append messageSent, other.messageSent
		builder.append userDeleted, other.userDeleted
		builder.append clientId, other.clientId
		builder.append duration, other.duration
		builder.append prevStatus, other.prevStatus
		builder.append prevEventUnixtime, other.prevEventUnixtime
		builder.append sender, other.sender
		builder.append origin, other.origin
		builder.append expiretime, other.expiretime
		builder.append color, other.color
		builder.append prevcolor, other.prevcolor
		builder.append changetime, other.changetime
		builder.append disabletime, other.disabletime
		builder.append disablemsg, other.disablemsg
		builder.append downtimeactive, other.downtimeactive
		builder.append clienttstamp, other.clienttstamp
		builder.isEquals()
	}

	static mapping = {
		id composite: ["id", "timestamp", "year", "month", "day", "hour", "eventUnixtime", "customerId", "monitoringSystemId", "deviceId", "metricId", "status", "acknowledgeId", "messageSent", "userDeleted", "clientId", "duration", "prevStatus", "prevEventUnixtime", "sender", "origin", "expiretime", "color", "prevcolor", "changetime", "disabletime", "disablemsg", "downtimeactive", "clienttstamp"]
		version false
	}

	static constraints = {
		acknowledgeId nullable: true
		duration nullable: true
		prevStatus nullable: true
		prevEventUnixtime nullable: true
		sender nullable: true, maxSize: 256
		origin nullable: true, maxSize: 256
		expiretime nullable: true
		color nullable: true, maxSize: 20
		prevcolor nullable: true, maxSize: 20
		changetime nullable: true
		disabletime nullable: true
		disablemsg nullable: true, maxSize: 1000
		downtimeactive nullable: true
		clienttstamp nullable: true
	}
}
