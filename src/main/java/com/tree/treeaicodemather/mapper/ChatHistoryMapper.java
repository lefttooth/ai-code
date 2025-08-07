package com.tree.treeaicodemather.mapper;

import com.mybatisflex.core.BaseMapper;
import com.mybatisflex.core.paginate.Page;
import com.tree.treeaicodemather.common.BaseResponse;
import com.tree.treeaicodemather.common.ResultUtils;
import com.tree.treeaicodemather.model.entity.ChatHistory;
import com.tree.treeaicodemather.model.entity.User;
import com.tree.treeaicodemather.service.AppService;
import com.tree.treeaicodemather.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;


/**
 * 对话历史 映射层。
 *
 * @author <a href="https://github.com/lefttooth">lefttooth</a>
 */
public interface ChatHistoryMapper extends BaseMapper<ChatHistory> {




}
