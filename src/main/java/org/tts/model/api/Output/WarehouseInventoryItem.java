package org.tts.model.api.Output;

import org.springframework.hateoas.ResourceSupport;
import org.tts.model.common.GraphEnum.WarehouseGraphNodeType;

public class WarehouseInventoryItem extends ResourceSupport {
	private String entityUUID;
	private String name;
	private String organismCode;
	private String source;
	private String sourceVersion;
	private WarehouseGraphNodeType warehouseGraphNodeType;

	public WarehouseInventoryItem() {
		super();
	}
	public WarehouseInventoryItem(WarehouseInventoryItem item) {
		super();
		this.entityUUID = item.getEntityUUID();
		this.name = item.getName();
		this.organismCode = item.getOrganismCode();
		this.source = item.getSource();
		this.sourceVersion = item.getSourceVersion();
		this.warehouseGraphNodeType = item.getWarehouseGraphNodeType();
	}
	public String getEntityUUID() {
		return entityUUID;
	}
	public void setEntityUUID(String entityUUID) {
		this.entityUUID = entityUUID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganismCode() {
		return organismCode;
	}
	public void setOrganismCode(String organismCode) {
		this.organismCode = organismCode;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceVersion() {
		return sourceVersion;
	}
	public void setSourceVersion(String sourceVersion) {
		this.sourceVersion = sourceVersion;
	}
	public WarehouseGraphNodeType getWarehouseGraphNodeType() {
		return warehouseGraphNodeType;
	}
	public void setWarehouseGraphNodeType(WarehouseGraphNodeType warehouseGraphNodeType) {
		this.warehouseGraphNodeType = warehouseGraphNodeType;
	}
	
}
