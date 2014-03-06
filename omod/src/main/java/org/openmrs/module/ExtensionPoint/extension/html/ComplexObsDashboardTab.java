package org.openmrs.module.ExtensionPoint.extension.html;

import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.PatientDashboardTabExt;

/**
 * Created with IntelliJ IDEA.
 * User: REACH9
 * Date: 3/5/14
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComplexObsDashboardTab extends PatientDashboardTabExt {

    public Extension.MEDIA_TYPE getMediaType() {
        return Extension.MEDIA_TYPE.html;
    }

    @Override
    public String getPortletUrl() {
        return "patientExample";
    }

    @Override
    public String getRequiredPrivilege() {
        return "Patient Dashboard - View Example Section";
    }

    @Override
    public String getTabId() {
        return "PatientExample";
    }

    @Override
    public String getTabName() {
        return "ComplexObs";
    }

}
