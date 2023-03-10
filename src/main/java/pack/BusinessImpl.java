package pack;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessImpl implements BusinessInter{
	
	@Autowired
	private SangpumInter inter;
	
	public void dataList() {
		ArrayList<SangpumDto> dlist = inter.seleList();
		
		for(SangpumDto s:dlist) {
			System.out.println(s.getCode() + " " + s.getSang() + " " + s.getSu() + " " + s.getDan());
		}
	}
}
