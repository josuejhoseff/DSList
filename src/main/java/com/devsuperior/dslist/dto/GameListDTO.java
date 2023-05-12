package com.devsuperior.dslist.dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.GameList;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;

public class GameListDTO {
	
	
	private Long id;
	private String name;
	
	public GameListDTO() {
	}
	
	public GameListDTO(GameList list) {
		this.id = list.getId();
		this.name = list.getName();
		//BeanUtils.copyProperties(list, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameListDTO other = (GameListDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
