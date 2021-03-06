package io.renren.notebook.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author haijun.zhang
 * @date 2019/12/21
 * @time 22:56
 */
@Data
public class NoteDetailBO implements Serializable {

    private static final long serialVersionUID = 9096548796645550497L;

    private Long id;

    private String title;

    private String content;

    private Integer degree;
}