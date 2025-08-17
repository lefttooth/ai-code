# Tree AI Code Mother

Tree AI Code Mother 是一个基于 Spring Boot + Vue3 的智能代码生成与管理平台，支持多模型、多应用场景，前后端分离，易于扩展。

## 项目架构

- **后端**：Spring Boot 3，集成 LangChain4j、MyBatis-Flex、Knife4j，支持 Redis 缓存、MySQL 数据库。
- **前端**：Vue3 + Vite + Ant Design Vue，现代化 SPA，支持多页面和组件化开发。
# AI零代码应用生成平台教程

## 项目简介
本项目是一个面向开发者和业务人员的 AI 零代码应用生成平台，旨在通过可视化和智能化方式，快速搭建和部署 AI 驱动的业务应用。平台涵盖了项目初始化、用户管理、应用生成、对话历史、功能扩展、系统优化、可观测性、安全与部署等完整流程。

## 核心功能
- 零代码可视化搭建业务应用
- 支持多种 AI 能力集成（如对话、智能推荐、自动化流程等）
- 用户与权限管理
- 应用模块化扩展
- 对话历史追踪与分析
- 一键部署与上线
- 系统安全与可观测性

## 系统架构
平台采用模块化设计，主要包括：
- 用户模块
- 应用模块
- AI生成应用模块
- 对话历史模块
- 功能扩展模块
- 系统优化与安全模块
- 部署与可观测性模块

![系统架构图](data:image/jpeg;base64,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)

## 业务模块说明
### 用户模块
- 用户注册、登录、权限分配
- 支持多角色管理

### 应用模块
- 应用创建、编辑、删除
- 支持多种业务场景扩展

### AI生成应用模块
- 智能生成业务流程与界面
- 支持自定义 AI 能力集成

### 对话历史模块
- 记录用户与 AI 的所有交互历史
- 支持检索、分析与导出

### 功能扩展模块
- 插件式扩展业务能力
- 支持第三方服务集成

### 系统优化与安全模块
- 性能监控与优化建议
- 数据安全与权限管控

### 部署与可观测性模块
- 一键部署到云端或本地
- 支持日志、监控、告警

## 项目初始化流程
1. 克隆项目到本地
2. 安装依赖
3. 配置环境变量
4. 启动开发环境
5. 访问平台进行可视化搭建

## 部署上线流程
1. 配置生产环境参数
2. 构建并打包项目
3. 部署到服务器或云平台
4. 配置域名与安全策略

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
