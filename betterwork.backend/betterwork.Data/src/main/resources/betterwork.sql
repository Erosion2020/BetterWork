create database if not exists betterwork;
use betterwork;
CREATE TABLE temp_account(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '唯一标识 唯一标识' ,
    username VARCHAR(128) NOT NULL   COMMENT '用户名 用户名' ,
    phone_number VARCHAR(32)    COMMENT '手机号 手机号' ,
    email VARCHAR(128) NOT NULL   COMMENT '邮箱 邮箱(用户激活)' ,
    password VARCHAR(32) NOT NULL   COMMENT '密码 MD5(加密)密码' ,
    create_time DATETIME    COMMENT '创建时间' ,
    PRIMARY KEY (id)
) COMMENT = '临时账户表 存储：用户名(昵称)、邮箱、手机号、密码(使用MD5加密)、账户的使用人(可能身份：公司员工(内部账户)、业主)';

ALTER TABLE temp_account ADD UNIQUE email(email);
ALTER TABLE temp_account ADD UNIQUE phone_number(phone_number);
ALTER TABLE temp_account COMMENT '临时账户表';
CREATE TABLE account(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '账户唯一标识 账户的唯一标识' ,
    username VARCHAR(128) NOT NULL  DEFAULT 'betterwork' COMMENT '用户名 账户昵称' ,
    email VARCHAR(128) NOT NULL   COMMENT '用户邮箱 账户绑定邮箱' ,
    phone VARCHAR(32)    COMMENT '手机号 账户手机号' ,
    password VARCHAR(32) NOT NULL   COMMENT '密码 账户密码(MD5加密)' ,
    account_type TINYINT(1) NOT NULL  DEFAULT 0 COMMENT '账户所有者 所有者(员工1/业主0)' ,
    status TINYINT(1) NOT NULL  DEFAULT 1 COMMENT '账户状态 1使用/0注销' ,
    is_admin TINYINT(1) NOT NULL  DEFAULT 0 COMMENT '是否是管理员 1管理员/0不是管理员' ,
    PRIMARY KEY (id)
) COMMENT = '账户表 存储：用户名(昵称)、邮箱、手机号、密码(使用MD5加密)、账户的使用人(可能身份：公司员工(内部账户)、业主)';

ALTER TABLE account ADD UNIQUE email(email);
ALTER TABLE account ADD UNIQUE phone(phone);
ALTER TABLE account ADD INDEX accountype(account_type);
ALTER TABLE account ADD INDEX status(status);
ALTER TABLE account COMMENT '账户表';
CREATE TABLE employee(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '唯一标识 查询主键' ,
    name VARCHAR(128) NOT NULL   COMMENT '员工姓名 员工姓名' ,
    account_id INT    COMMENT '拥有账户 账户id' ,
    gender TINYINT(1) NOT NULL  DEFAULT 1 COMMENT '员工性别 男/女' ,
    nation VARCHAR(32) NOT NULL  DEFAULT '汉' COMMENT '员工民族 员工名族' ,
    birth DATE NOT NULL   COMMENT '员工出生年月 员工出生时间-庆生-集体活动等' ,
    identity_number VARCHAR(128) NOT NULL   COMMENT '员工身份证号 员工的身份证号' ,
    political_outlook VARCHAR(128) NOT NULL   COMMENT '政治面貌 共青团员/中央党员......等' ,
    entry_time DATE NOT NULL   COMMENT '入职时间 员工入职的时间-方便统计薪资等数据' ,
    register_residen_nature TINYINT(1) NOT NULL  DEFAULT 1 COMMENT '户口性质 农业1/非农业0' ,
    register_residen_place VARCHAR(128) NOT NULL   COMMENT '户口所在地 户口信息所在地' ,
    phone_number VARCHAR(128) NOT NULL   COMMENT '联系方式/手机号码 员工联系方式' ,
    education_experience_id INT NOT NULL   COMMENT '教育经历 员工教育经历' ,
    emotion VARCHAR(32) NOT NULL   COMMENT '婚姻状况 员工感情情况(未婚/已婚/离异/丧偶/空白)' ,
    post_id INT NOT NULL   COMMENT '岗位信息 员工所担任的岗位(岗位id)' ,
    home_address VARCHAR(128) NOT NULL   COMMENT '家庭地址(现居住地址) 员工住址' ,
    salary DECIMAL(32,8) NOT NULL   COMMENT '薪资 员工薪资' ,
    is_on_job TINYINT(1) NOT NULL  DEFAULT 1 COMMENT '在职情况 员工(在职1/离职0)' ,
    PRIMARY KEY (id)
) COMMENT = '员工信息 保存所有公司账户信息(姓名、性别、民族、出生年月、身份证号、入职时间、是否在职、户口性质(农业/非农业)、户口所在地、联系方式)--外关联1(岗位/职务--关联薪资)--外关联2(毕业院校)--外关联3(家庭地址、现住址)--外关联3(婚姻状况)';

ALTER TABLE employee ADD INDEX post(post_id);
ALTER TABLE employee ADD INDEX gender(gender);
ALTER TABLE employee ADD UNIQUE phone_number(phone_number);
ALTER TABLE employee ADD INDEX is_on_job(is_on_job);
ALTER TABLE employee COMMENT '员工信息';
CREATE TABLE owner(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '唯一标识 业主唯一标识' ,
    name VARCHAR(32) NOT NULL   COMMENT '姓名 业主姓名' ,
    account_id INT    COMMENT '拥有账户 业主所拥有的账户' ,
    gender TINYINT(1)   DEFAULT 1 COMMENT '性别 业主性别' ,
    identity_number VARCHAR(32)    COMMENT '身份证号 业主身份证号' ,
    organization VARCHAR(128)    COMMENT '工作单位 业主的工作单位/公司/组织' ,
    address VARCHAR(128)    COMMENT '住址 业主的具体住址' ,
    phone VARCHAR(32) NOT NULL   COMMENT '联系方式(手机号) 业主的联系方式' ,
    owner_status TINYINT(1)   DEFAULT 1 COMMENT '业主状态(现在是否仍是业主) 1业主/0已不是 现在是否仍是业主' ,
    PRIMARY KEY (id)
) COMMENT = '业主信息表 保存业主基本信息：业主名称';

ALTER TABLE owner ADD INDEX owner_status(owner_status);
ALTER TABLE owner ADD INDEX gender(gender);
ALTER TABLE owner COMMENT '业主信息表';
CREATE TABLE education_experience(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '唯一标识 唯一标识' ,
    school_name VARCHAR(128) NOT NULL   COMMENT '学校姓名 学校名称' ,
    start_time DATETIME NOT NULL   COMMENT '入学时间 入学时间' ,
    end_time DATETIME NOT NULL   COMMENT '毕业时间 毕业时间' ,
    mojor VARCHAR(128) NOT NULL   COMMENT '专业 大学所在专业' ,
    education VARCHAR(32) NOT NULL   COMMENT '学历 本科/专科/硕士/博士' ,
    PRIMARY KEY (id)
) COMMENT = '教育经历表 存储：学校、入学时间、毕业时间、专业、学历';

ALTER TABLE education_experience COMMENT '教育经历表';
CREATE TABLE department(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '部门唯一标识 部门唯一标识' ,
    name VARCHAR(32) NOT NULL   COMMENT '部门名称 部门名称' ,
    address VARCHAR(128) NOT NULL   COMMENT '部门所在地址 部门所在地址' ,
    information VARCHAR(1024)    COMMENT '部门职责简介 部门职责简介' ,
    now_count INT    COMMENT '部门员工总数 部门员工总数' ,
    want_count INT    COMMENT '期望员工总数 期望员工总数(招聘/裁员等操作)' ,
    exist_now VARCHAR(1) NOT NULL  DEFAULT 1 COMMENT '部门现在是否存在 部门现在是否存在' ,
    PRIMARY KEY (id)
) COMMENT = '部门信息表 存储：部门名称、部门所在地址、部门职责简介、部门下对应职务(多对多关系)、部门员工总数、期望员工总数';

ALTER TABLE department ADD INDEX exist_now(exist_now);
ALTER TABLE department COMMENT '部门信息表';
CREATE TABLE department_post(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '部门-岗位主键 部门-岗位主键' ,
    department_id INT NOT NULL   COMMENT '部门主键 部门标识' ,
    post_id INT NOT NULL   COMMENT '岗位主键 岗位标识' ,
    PRIMARY KEY (id)
) COMMENT = '部门与岗位关联表 存储部门主键-岗位主键';

ALTER TABLE department_post ADD INDEX department(department_id);
ALTER TABLE department_post ADD INDEX post(post_id);
ALTER TABLE department_post COMMENT '部门与岗位关联表';
CREATE TABLE post(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '岗位唯一标识 职务标识' ,
    name VARCHAR(128) NOT NULL   COMMENT '岗位名称 岗位的名称' ,
    job_desc VARCHAR(1024)    COMMENT '岗位的职责信息 岗位信息简介' ,
    min_money DECIMAL(32,8) NOT NULL   COMMENT '岗位最低薪资 岗位应给予的最低薪资' ,
    max_money DECIMAL(32,8) NOT NULL   COMMENT '岗位最高薪资 岗位应给予的最高薪资' ,
    exist_now VARCHAR(1) NOT NULL  DEFAULT 1 COMMENT '岗位现在是否存在 岗位现是否已经废除' ,
    authorization INT NOT NULL  DEFAULT 1 COMMENT '岗位权限 岗位的权限(比如操作员工等)' ,
    PRIMARY KEY (id)
) COMMENT = '岗位信息表 存储: 岗位主键、岗位名称、岗位职责、薪资取值范围(min/max)';

ALTER TABLE post ADD INDEX exist_now(exist_now);
ALTER TABLE post COMMENT '岗位信息表';
CREATE TABLE work_order(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '工单id 工单编号' ,
    title VARCHAR(32) NOT NULL   COMMENT '工单标题 工单标题' ,
    description VARCHAR(1024) NOT NULL   COMMENT '工单描述 工单具体内容描述' ,
    submitter_id INT NOT NULL   COMMENT '工单提交人 提交工单的员工' ,
    executor_id INT    COMMENT '工单处理人 处理工单的员工' ,
    manage_id INT    COMMENT '工单分发者 分发任务的人员' ,
    untreated TINYINT(1) NOT NULL  DEFAULT 1 COMMENT '工单处理情况 工单处理情况(1未处理/0已处理)' ,
    create_time DATETIME NOT NULL   COMMENT '工单提交时间 工单提交时间' ,
    PRIMARY KEY (id)
) COMMENT = '工单表 由员工提供工单，该工单将交由任务管理人进行任务分发，然后对应的岗位最高负责人再进行任务下发';

ALTER TABLE work_order ADD INDEX untreated(untreated);
ALTER TABLE work_order ADD INDEX submitter(submitter_id);
ALTER TABLE work_order ADD INDEX executor(executor_id);
ALTER TABLE work_order ADD INDEX manage(manage_id);
ALTER TABLE work_order COMMENT '工单表';
CREATE TABLE work_task(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '任务id 任务列表' ,
    title VARCHAR(32) NOT NULL   COMMENT '任务标题 任务标题' ,
    description VARCHAR(1024) NOT NULL   COMMENT '任务描述 任务正文' ,
    submitter_id INT NOT NULL   COMMENT '任务提交人 提交的业主' ,
    executor_id INT    COMMENT '任务处理人 处理任务的员工' ,
    manage_id INT    COMMENT '任务分发者 分发任务单的员工' ,
    untreated TINYINT(1) NOT NULL  DEFAULT 1 COMMENT '任务处理情况 任务完成情况(1未完成/1完成)' ,
    create_time DATETIME NOT NULL   COMMENT '任务提交时间 任务创建时间' ,
    PRIMARY KEY (id)
) COMMENT = '工作任务表 由业主提交的任务列表，反映其问题情况、问题详情，然后交由任务管理人来做任务分发';

ALTER TABLE work_task ADD INDEX untreated(untreated);
ALTER TABLE work_task ADD INDEX submitter(submitter_id);
ALTER TABLE work_task ADD INDEX executor(executor_id);
ALTER TABLE work_task ADD INDEX manage(manage_id);
ALTER TABLE work_task COMMENT '工作任务表';
CREATE TABLE owner_contacts(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '唯一标识 业主紧急联系人' ,
    owner_id INT NOT NULL   COMMENT '业主id 关联业主id' ,
    name VARCHAR(32) NOT NULL   COMMENT '姓名 联系人姓名' ,
    relation VARCHAR(32) NOT NULL   COMMENT '关系 联系人与业主的关系' ,
    phone VARCHAR(32) NOT NULL   COMMENT '手机号 联系人手机号' ,
    PRIMARY KEY (id)
) COMMENT = '业主联系人 存储：业主联系人姓名、关系、手机号';

ALTER TABLE owner_contacts ADD INDEX owner(owner_id);
ALTER TABLE owner_contacts COMMENT '业主联系人';
