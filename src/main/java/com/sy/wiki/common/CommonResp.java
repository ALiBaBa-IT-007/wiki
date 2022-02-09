package com.sy.wiki.common;

/**
 * @author 李旺
 * @project_name wiki
 * @ClassName:CommonResp
 * @company 思盈网络科技-技术部
 * @Level P6
 * @create 2022/2/9-11:02 AM
 * @Package com.sy.wiki.common
 * @Description: 返回给前端的通用规范(用一句话描述该文件做什么)
 */
public class CommonResp<T> {
    /**
     * 业务上的成功或失败
     */
    private boolean success = true;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回泛型数据，自定义类型
     */
    private T data;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T content) {
        this.data = content;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResponseDto{");
        sb.append("success=").append(success);
        sb.append(", message='").append(message).append('\'');
        sb.append(", content=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
