package com.everwing.coreservice.common.wy.service.configuration.cmac.service;

import com.everwing.coreservice.common.wy.entity.configuration.project.TBsProject;

public interface CmacElectService extends ICmacService{

	public void invoke(String companyId, TBsProject project);
}
