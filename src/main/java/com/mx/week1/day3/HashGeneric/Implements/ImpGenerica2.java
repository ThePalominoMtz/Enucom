package com.mx.week1.day3.HashGeneric.Implements;

import java.util.ArrayList;
import java.util.List;

import com.mx.week1.day3.HashGeneric.Principal.IMetodos;

public class ImpGenerica2 implements IMetodos {

	List<Object> lista = new ArrayList<>();

	public void guardar(Object value) {
		lista.add(value);
	}

	@Override
	public void editar(Object key, Object value) {
		// TODO Auto-generated method stub
		int key2 = Integer.parseInt(key.toString());
		lista.set(key2, value);

	}

	@Override
	public void eliminar(Object key) {
		// TODO Auto-generated method stub
		int key2 = Integer.parseInt(key.toString());
		lista.remove(key2);

	}

	@Override
	public Object buscar(Object key) {
		// TODO Auto-generated method stub
		int key2 = Integer.parseInt(key.toString());

//		hash.containsKey(key)
		if (lista.size() > 0) {
			return lista.get(key2);
		} else {
			return null;
		}

	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

		System.out.println(lista);
	}

}
