package controller.developer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.developer.AppCategoryService;
import service.developer.AppInfoService;
import service.developer.AppVersionService;
import service.developer.DataDictionaryService;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/dev/flatform/app1")
public class AppControllers {

    @Resource
    private AppInfoService appInfoService;
    @Resource
    private DataDictionaryService dataDictionaryService;
    @Resource
    private AppCategoryService appCategoryService;
    @Resource
    private AppVersionService appVersionService;


}
