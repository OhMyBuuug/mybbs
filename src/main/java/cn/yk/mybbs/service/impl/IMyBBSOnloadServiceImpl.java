package cn.yk.mybbs.service.impl;

import cn.yk.mybbs.dao.moduleMapper;
import cn.yk.mybbs.service.IMyBBSOnloadService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.service.impl
 * <br> Description:
 * <br> Date: Created in 15:00 2016/12/21.
 * <br> Modified By
 *
 * @author SiGen
 */
@Service("iMyBBSOnloadService")
public class IMyBBSOnloadServiceImpl implements IMyBBSOnloadService {
    @Resource
    private moduleMapper modules;
    @Override
    public List getMoudlesAndSections() {
        HashMap modules = new HashMap();
        HashMap sections = new HashMap();
        return null;
    }
}
