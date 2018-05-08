package cn.atxty.jxwl.domain;
/*
 * 代码分类实体类
 */
public class ClassCode {
    private String classCodeId;

    private String name;

    public String getClassCodeId() {
        return classCodeId;
    }

    public void setClassCodeId(String classCodeId) {
        this.classCodeId = classCodeId == null ? null : classCodeId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}