package br.com.rsi.hub.Utility;


public class MassOfData {
	
	public String userName() throws Exception {
		ExcelUtils.setExcelFile(ConstantExcel.Path_Cadastro + ConstantExcel.File_Cadastro, "Planilha2");
		String userName = ExcelUtils.getCellData(0, 1);
		return userName;
	}
	
	public String passWord() throws Exception {
		String passWord = ExcelUtils.getCellData(1, 1);
		return passWord;
	}
	
	public String safePayUserName() throws Exception {
		String safePayUseName = ExcelUtils.getCellData(2, 1);
		return safePayUseName;
	}
	
	public String safePayPassWord() throws Exception{
		String safePayPassWord = ExcelUtils.getCellData(3, 1);
		return safePayPassWord;
	}

}
