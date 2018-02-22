package jb.springbootlearn.socialmedia;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@RestResource

public interface SocialMediaRepo extends PagingAndSortingRepository<SocialMedia, String>  {
	
		public List<SocialMedia> findByappType(
				@Param("appType") String appType, @Param("appName") String appName, @Param("appDesc") String appDesc);

		@Transactional
		public String deleteSM(String appType);

}
