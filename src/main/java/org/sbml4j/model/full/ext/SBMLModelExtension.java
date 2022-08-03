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
package org.sbml4j.model.full.ext;


import org.neo4j.ogm.annotation.Relationship;
import org.sbml4j.model.full.SBMLModelEntity;


public class SBMLModelExtension extends SBMLSBaseExtension {

	@Relationship(type = "IS_EXTENSION_OF", direction = Relationship.OUTGOING)
	public SBMLModelEntity parentModel;

	public SBMLModelEntity getParentModel() {
		return parentModel;
	}
	
	public void setParentModel(SBMLModelEntity parentModel) {
		this.parentModel = parentModel;
	}
}
