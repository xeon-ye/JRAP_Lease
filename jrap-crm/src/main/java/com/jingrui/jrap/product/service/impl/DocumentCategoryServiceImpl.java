package com.jingrui.jrap.product.service.impl;

import com.jingrui.jrap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.jingrui.jrap.product.dto.DocumentCategory;
import com.jingrui.jrap.product.service.IDocumentCategoryService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class DocumentCategoryServiceImpl extends BaseServiceImpl<DocumentCategory> implements IDocumentCategoryService {

}