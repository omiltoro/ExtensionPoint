package org.openmrs.module.ExtensionPoint.web.controller;

import org.apache.commons.lang.StringUtils;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.web.controller.PortletController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: REACH9
 * Date: 3/6/14
 * Time: 9:57 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("**/this.portlet")
public class ComplexObsPortletController extends PortletController {
    @SuppressWarnings("unchecked")
    @Override
    protected void populateModel(HttpServletRequest request, Map<String, Object> model) {
// your code here

    }
}
