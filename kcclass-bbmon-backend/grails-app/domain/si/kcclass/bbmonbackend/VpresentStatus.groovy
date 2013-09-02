package si.kcclass.bbmonbackend

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class VpresentStatus implements Serializable {

	Integer eventId
	Long eventTime
	Integer eventCustomerId
	Integer eventMonSysId
	Integer eventDeviceId
	Integer eventMetricId
	Integer eventStatus
	Integer eventHistoryId
	Integer eventClientId
	String eventStatusColor
	Integer eventDuration

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append eventId
		builder.append eventTime
		builder.append eventCustomerId
		builder.append eventMonSysId
		builder.append eventDeviceId
		builder.append eventMetricId
		builder.append eventStatus
		builder.append eventHistoryId
		builder.append eventClientId
		builder.append eventStatusColor
		builder.append eventDuration
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append eventId, other.eventId
		builder.append eventTime, other.eventTime
		builder.append eventCustomerId, other.eventCustomerId
		builder.append eventMonSysId, other.eventMonSysId
		builder.append eventDeviceId, other.eventDeviceId
		builder.append eventMetricId, other.eventMetricId
		builder.append eventStatus, other.eventStatus
		builder.append eventHistoryId, other.eventHistoryId
		builder.append eventClientId, other.eventClientId
		builder.append eventStatusColor, other.eventStatusColor
		builder.append eventDuration, other.eventDuration
		builder.isEquals()
	}

	static mapping = {
		id composite: ["eventId", "eventTime", "eventCustomerId", "eventMonSysId", "eventDeviceId", "eventMetricId", "eventStatus", "eventHistoryId", "eventClientId", "eventStatusColor", "eventDuration"]
		version false
	}

	static constraints = {
		eventStatusColor nullable: true, maxSize: 20
		eventDuration nullable: true
	}
}
