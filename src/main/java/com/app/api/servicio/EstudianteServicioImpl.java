package com.app.api.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.api.entidad.Estudiante;
import com.app.api.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImpl implements EstudianteServicio{

	@Autowired
	private EstudianteRepositorio repositorio;
	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		return repositorio.findAll();
	}
	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}
	@Override
	public Estudiante obtenerEstudiantePorId(Long id) {
		return repositorio.findById(id).get();
	}
	@Override
	public Estudiante actualizarEstudiante(Estudiante estudiante) {
		
		return repositorio.save(estudiante);
	}
	@Override
	public void eliminarEstudiante(Long id) {
		repositorio.deleteById(id);
	}
	
}
