package com.vinhnq.scheduling;

import com.vinhnq.beans.AppInfoBean;
import com.vinhnq.beans.FileSize;
import com.vinhnq.common.CommonConst;
import com.vinhnq.dao.AppInfoDAO;
import com.vinhnq.entity.AppInfo;
import com.vinhnq.repository.AppInfoRepository;
import com.vinhnq.service.ReadFileInformationService;
import com.vinhnq.service.impl.ReadFileInformationServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;


/*
 * This is class of Scheduler auto run task load  
 */

@Component("schedulerController")
@Transactional
public class SchedulerController {
	private static final Logger logger = LogManager.getLogger(SchedulerController.class);

	private final AppInfoDAO appInfoDAO;
	private final AppInfoRepository appInfoRepository;
	public SchedulerController(AppInfoDAO appInfoDAO, AppInfoRepository appInfoRepository) {
		this.appInfoDAO = appInfoDAO;

		this.appInfoRepository = appInfoRepository;
	}


	@Scheduled(fixedDelay = 30000)
	public void alertScheduler() {
//		try {
//		//	ResponseAPI<String>  alert = alertService.alertStepCounter(userId, 5);
//		//	System.err.println(alert.getMessage());
//			ReadFileInformationService readFileInformationService = new ReadFileInformationServiceImpl();
//
//			AppInfoBean appInfoBean = new AppInfoBean();
//			appInfoBean.setDeleteFlg(CommonConst.DELETE_FLG.NON_DELETE);
//			appInfoBean.setAppType(AppInfoBean.IPA);
//			List<AppInfo> appInfos = this.appInfoDAO.getListApp(appInfoBean);
//			int total = appInfos.
//			for (AppInfo appInfo : appInfos) {
//				if ("ipa".equals(appInfo.getAppType()) && null == appInfo.getCertificateExpirationDate()) {
//					System.out.println(appInfo.getId());
//					AppInfoBean infoBean = readFileInformationService.readFileIPA(
//							new File(appInfo.getAppPath()), new FileSize(15D, "MB"),
//							"host");
//					appInfo.setCertificateExpirationDate(infoBean.getCertificateExpirationDate());
//					this.appInfoRepository.saveAndFlush(appInfo);
//				}
//			}
//			System.out.println("Done");
//		} catch (Exception ex) {
//			logger.error(ex.getMessage(), ex);
//		}
	}

}
