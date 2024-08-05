package com.vinhnq;

import com.vinhnq.beans.AppInfoBean;
import com.vinhnq.beans.FileSize;
import com.vinhnq.common.CommonConst;
import com.vinhnq.dao.AppInfoDAO;
import com.vinhnq.entity.AppInfo;
import com.vinhnq.repository.AppInfoRepository;
import com.vinhnq.service.ReadFileInformationService;
import com.vinhnq.service.impl.ReadFileInformationServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.List;

@SpringBootTest
class SensorSystemApplicationTests {

//	@Test
//	void updateCertificateExpirationDate() {
//		ReadFileInformationService readFileInformationService = new ReadFileInformationServiceImpl();
//
//		AppInfoBean appInfoBean = new AppInfoBean();
//		appInfoBean.setDeleteFlg(CommonConst.DELETE_FLG.NON_DELETE);
//		List<AppInfo> appInfos = this.appInfoDAO.getListApp(appInfoBean);
//		for (AppInfo appInfo : appInfos) {
//			if ("ipa".equals(appInfo.getAppType()) && null == appInfo.getCertificateExpirationDate()) {
//				AppInfoBean infoBean = readFileInformationService.readFileIPA(
//						new File(appInfo.getAppPath()), new FileSize(15D, "MB"),
//						"host");
//				appInfo.setCertificateExpirationDate(infoBean.getCertificateExpirationDate());
//				this.appInfoRepository.save(appInfo);
//			}
//		}
//	}
//
}
