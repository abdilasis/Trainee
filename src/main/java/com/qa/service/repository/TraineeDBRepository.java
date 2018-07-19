package com.qa.service.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.entity.Trainee;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepository implements TraineeRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllTrainees() {
		Query query = manager.createQuery("Select a FROM Trainee a");
		Collection<Trainee> trainee = (Collection<Trainee>) query.getResultList();
		return util.getJSONForObject(trainee);
	}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

	
}
