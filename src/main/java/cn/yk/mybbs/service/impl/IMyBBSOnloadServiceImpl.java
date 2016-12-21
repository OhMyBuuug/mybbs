package cn.yk.mybbs.service.impl;

import cn.yk.mybbs.mysql.dao.moduleMapper;
import cn.yk.mybbs.mysql.dao.sectionMapper;
import cn.yk.mybbs.mysql.model.module;
import cn.yk.mybbs.mysql.model.section;
import cn.yk.mybbs.service.IMyBBSOnloadService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
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
    private moduleMapper iModuleMapper;
    @Resource
    private sectionMapper iSectionMapper;
    /**
     * <br> Description: 获取所有的模块
     * <br> Date: Created in 17:38 2016/12/21.
     * <br> Modified By
     * @return List<module>
     */
    @Override
    public List<module> getMoudles() {
        List<module> modules = iModuleMapper.getAllModules();
        System.out.println(modules.toString());

        return modules;
    }
    /**
     * <br> Description: 获取所有的子模块
     * <br> Date: Created in 17:38 2016/12/21.
     * <br> Modified By
     * @return List<section>
     */
    @Override
    public List<section> getSections() {
        List<section> sections = iSectionMapper.getAllSections();
        System.out.println(sections.toString());

        return sections;
    }
}
