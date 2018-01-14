package com.website.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.website.common.domain.LogDO;
import com.website.common.domain.PageDO;
import com.website.common.utils.Query;
@Service
public interface LogService {
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
