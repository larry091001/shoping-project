package com.mallplus.marking.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mallplus.marking.entity.SmsFlashPromotionProductRelation;
import com.mallplus.marking.entity.SmsFlashPromotionSession;
import com.mallplus.marking.mapper.SmsFlashPromotionProductRelationMapper;
import com.mallplus.marking.mapper.SmsFlashPromotionSessionMapper;
import com.mallplus.marking.service.ISmsFlashPromotionProductRelationService;
import com.mallplus.marking.vo.SmsFlashPromotionSessionDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 商品限时购与商品关系表 服务实现类
 * </p>
 *
 * @author zscat
 * @since 2019-04-19
 */
@Service
public class SmsFlashPromotionProductRelationServiceImpl extends ServiceImpl<SmsFlashPromotionProductRelationMapper, SmsFlashPromotionProductRelation> implements ISmsFlashPromotionProductRelationService {
    @Autowired
    private SmsFlashPromotionProductRelationMapper relationMapper;
    @Override
    public int getCount(Long flashPromotionId, Long flashPromotionSessionId) {
        return this.count(new QueryWrapper<>(new SmsFlashPromotionProductRelation()).eq("flash_promotion_id",flashPromotionId)
        .eq("flash_promotion_session_id",flashPromotionSessionId));
    }
}
