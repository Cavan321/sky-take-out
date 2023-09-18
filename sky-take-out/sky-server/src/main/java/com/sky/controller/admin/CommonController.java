package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author Cavan
 * @date 2023-09-18
 * @qq 2069543852
 */
@RestController
@RequestMapping("/admin/common")
@Api(tags = "通用接口")
@Slf4j
public class CommonController {

    @PostMapping("/upload")
    @ApiOperation("文件上传")
    public Result<String> upload(MultipartFile file) {
        log.info("开始上传图片");
        // TODO 文件上传到云服务器的.jar包所在的目录的 images 文件夹下
        /*try {
            //获取文件的原始文件名
            String originalFilename = file.getOriginalFilename();
            //获取文件名的后缀
            int index = originalFilename.lastIndexOf(".");
            String suffixName = originalFilename.substring(index);
            //使用UUID生成唯一文件名,并拼接后缀
            String newFileName = UUID.randomUUID().toString() + suffixName;

            file.transferTo(new File("/image/waimai"));
            return Result.success();

        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("上传文件失败");
        }*/
        return Result.error("服务端未编写");
    }

}
