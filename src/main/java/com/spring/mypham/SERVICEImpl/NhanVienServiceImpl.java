package com.spring.mypham.SERVICEImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mypham.DAO.NhanVienDAO;
import com.spring.mypham.DAOImpl.NhanVienDAOImpl;
import com.spring.mypham.SERVICE.NhanVienService;
import com.spring.mypham.models.NhanVien;
@Service
public class NhanVienServiceImpl implements NhanVienService{
	@Autowired
	private NhanVienDAO nvDAO;
	
	public NhanVienServiceImpl() {
		this.nvDAO = new NhanVienDAOImpl();
	}

	@Override
	public void saveNhanVien(NhanVien nv) {
		// TODO Auto-generated method stub
		nvDAO.saveNhanVien(nv);
	}

	@Override
	public ArrayList<NhanVien> getAllNhanVien() {
		// TODO Auto-generated method stub
		return nvDAO.getAllNhanVien();
	}
	
}
