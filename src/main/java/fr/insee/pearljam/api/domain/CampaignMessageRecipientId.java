package fr.insee.pearljam.api.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This class is used to defines the association between OrganizationUnit and
 * Campaign tables.
 * 
 * @author Guillemet Paul
 */
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CampaignMessageRecipientId implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * The organizationUnit Id
	 */
	@Column(name = "message_id")
	private Long messageId;

	/**
	 * The campaign Id
	 */
	@Column(name = "campaign_id", nullable = true)
	private String campaignId;

	@Override
	public boolean equals(Object o) {
		return (this == o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMessageId(), getCampaignId());
	}

}
