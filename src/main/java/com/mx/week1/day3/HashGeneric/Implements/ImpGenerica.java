package com.mx.week1.day3.HashGeneric.Implements;

import java.util.HashMap;

import com.mx.week1.day3.HashGeneric.Principal.IMetodos;

public class ImpGenerica implements IMetodos {

	protected HashMap<Object, Object> hash = new HashMap<Object, Object>();

	public void guardar(Object key, Object value ) {
		hash.put(key, value);
	}

	@Override
	public void editar(Object key, Object value) {
		// TODO Auto-generated method stub
		hash.replace(key, value);

	}

	@Override
	public void eliminar(Object key) {
		// TODO Auto-generated method stub
		hash.remove(key);

	}

	@Override
	public Object buscar(Object key) {
		// TODO Auto-generated method stub
		if (hash.containsKey(key)) {
			return hash.get(key);
		} else {
			return null;
		}

	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

		System.out.println(hash);
	}

}
