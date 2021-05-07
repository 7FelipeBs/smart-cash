package com.felipebs.vitalarca.publico.user;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario implements Serializable{
	private static final long serialVersionUID = 202105071740L;
	
	@Id
	@Column(name = "COD_USUARIO")
	private Long codUsuario;
	
	@Column(name = "NOM_USUARIO")
	private String nomUsuario;
	
	@Column(name = "SEN_USUARIO")
	private String senUsuario;

	@Override
	public int hashCode() {
		return Objects.hash(nomUsuario, senUsuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) obj;
		return Objects.equals(nomUsuario, other.nomUsuario) && Objects.equals(senUsuario, other.senUsuario);
	}
}
