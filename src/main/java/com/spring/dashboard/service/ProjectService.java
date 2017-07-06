package com.spring.dashboard.service;

import java.util.List;

import com.spring.dashboard.entity.Project;

public interface ProjectService {

	public void addProject(Project project);

	public List<Project> listProject();

	public Project getProject(int id);

	public void deleteProject(Project project);
}
