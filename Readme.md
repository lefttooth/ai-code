# Tree AI Code Mother

Tree AI Code Mother 是一个基于 Spring Boot + Vue3 的智能代码生成与管理平台，支持多模型、多应用场景，前后端分离，易于扩展。

## 项目架构

- **后端**：Spring Boot 3，集成 LangChain4j、MyBatis-Flex、Knife4j，支持 Redis 缓存、MySQL 数据库。
- **前端**：Vue3 + Vite + Ant Design Vue，现代化 SPA，支持多页面和组件化开发。

## 主要功能

### 后端
- 应用管理：创建、编辑、删除、查询 AI 应用。
- 用户管理：注册、登录、权限校验。
- 对话历史：保存和查询用户与 AI 的交互记录。
- 代码生成：集成 LangChain4j，支持多模型代码生成。
- 工作流：支持流式输出和多步任务编排。
- 静态资源服务：支持代码预览和下载。
- 健康检查接口。

### 前端
- 应用展示与管理：我的应用、精选应用、应用创建与编辑。
- 用户登录注册、个人信息管理。
- 对话与代码生成页面。
- 支持多种交互和实时反馈。

## 技术栈

- **后端**：Spring Boot 3, LangChain4j, MyBatis-Flex, Redis, MySQL, Knife4j
- **前端**：Vue3, Vite, Ant Design Vue, Pinia, Axios, TypeScript

## 快速开始

### 后端启动
1. 安装并配置 MySQL、Redis。
2. 修改 `src/main/resources/application.yml` 数据库和 Redis 配置。
3. 执行 `sql/create_tabel.sql` 初始化数据库。
4. 运行主类 `TreeAiCodeMatherApplication.java` 或使用 `mvnw spring-boot:run` 启动服务。
5. 默认端口：`8123`，API 路径前缀：`/api`

### 前端启动
1. 进入 `tree-ai-code-mother-frontend` 目录。
2. 执行 `npm install` 安装依赖。
3. 执行 `npm run dev` 启动开发服务器。
4. 默认端口：`5173`，可通过浏览器访问。

## 目录结构

- `src/main/java/com/tree/treeaicodemather/` 后端核心代码
- `src/main/resources/` 配置文件、SQL、静态资源、Prompt 模板
- `tree-ai-code-mother-frontend/` 前端项目

## 相关文档

- [Spring Boot 官方文档](https://spring.io/projects/spring-boot)
- [Vue3 官方文档](https://vuejs.org/)
- [LangChain4j](https://github.com/langchain4j/langchain4j)
- [Ant Design Vue](https://antdv.com/docs/vue/introduce/)

## 联系与贡献

欢迎 Issue、PR 及建议！
