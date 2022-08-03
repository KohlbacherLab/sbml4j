/**
 * --------------------------------------------------------------------------
 *                                 SBML4j
 * --------------------------------------------------------------------------
 * University of Tuebingen, 2022.
 * 
 * This code is part of the SBML4j software package and subject to the terms
 * and conditions defined by its license (MIT License). For license details
 * please refer to the LICENSE file included as part of this source code
 * package.
 * 
 * For a full list of authors, please refer to the file AUTHORS.
 */
package org.sbml4j.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description
 * @author Thorsten Tiede
 *
 * @since 0.1
 */
@ConfigurationProperties(prefix = "sbml4j.externalresources.keggdatabase")
public class KEGGDatabaseProperties {

	private String pathwayLinkPrefix;
	
	private String pathwaySearchPrefix;

	public String getPathwayLinkPrefix() {
		return pathwayLinkPrefix;
	}

	public void setPathwayLinkPrefix(String pathwayLinkPrefix) {
		this.pathwayLinkPrefix = pathwayLinkPrefix;
	}

	public String getPathwaySearchPrefix() {
		return pathwaySearchPrefix;
	}

	public void setPathwaySearchPrefix(String pathwaySearchPrefix) {
		this.pathwaySearchPrefix = pathwaySearchPrefix;
	}
	
}
