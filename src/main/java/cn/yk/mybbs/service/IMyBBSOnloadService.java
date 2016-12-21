package cn.yk.mybbs.service;

import cn.yk.mybbs.mysql.model.module;
import cn.yk.mybbs.mysql.model.section;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <br> Project: mybbs
 * <br> Package: cn.yk.mybbs.service
 * <br> Description: mybbs页面加载时调用的服务
 * <br> Date: Created in 14:58 2016/12/21.
 * <br> Modified By
 *
 * @author SiGen
 */
@Service("iMyBBSOnloadService")
public interface IMyBBSOnloadService {
    /**
     * <br> Description: 获取所有模块
     * <br> Date: Created in 17:34 2016/12/21.
     * <br> Modified By
     * @return List<module>
     */
    public abstract List<module> getMoudles();
    /**
     * <br> Description: 获取所有子模块
     * <br> Date: Created in 17:35 2016/12/21.
     * <br> Modified By
     * @return List<section>
     */
    public abstract List<section> getSections();
}
