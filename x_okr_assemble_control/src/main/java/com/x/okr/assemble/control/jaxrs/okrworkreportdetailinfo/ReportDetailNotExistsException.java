package com.x.okr.assemble.control.jaxrs.okrworkreportdetailinfo;

import com.x.base.core.exception.PromptException;

class ReportDetailNotExistsException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	ReportDetailNotExistsException( String id ) {
		super("指定ID的工作汇报详细信息记录不存在。ID：" + id );
	}
}