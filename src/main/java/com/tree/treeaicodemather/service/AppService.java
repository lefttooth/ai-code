package com.tree.treeaicodemather.service;

import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.tree.treeaicodemather.model.dto.app.AppQueryRequest;
import com.tree.treeaicodemather.model.entity.App;
import com.tree.treeaicodemather.model.entity.User;
import com.tree.treeaicodemather.vo.AppVO;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/lefttooth">lefttooth</a>
 */
public interface AppService extends IService<App> {
    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String prompt, User loginUser);

    String deployApp(Long appId,User loginUser);

}
