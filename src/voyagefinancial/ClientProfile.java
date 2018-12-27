/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voyagefinancial;

/**
 *
 * @author TannerLuke
 */
public class ClientProfile {
    
    
    //Personal info
    private String firstName, lastName, birthMonth, birthDay, birthYear, company;
    private int retirementMonth, retirementDay;
    private int retirementYear, serviceMonth, serviceDay, serviceYear, maxAmount, bonus;
    private double percentPerDollar;
    private double maxPercentOfWage;
    private int age = 0;
    private int baseSalary;
    
    
    //Annuities Info
    private int assumedIncomeText, balancedFundsCostBasisText, balancedFundsCurrentBalanceText, balancedFundsDayText;
    private int balancedFundsMonthText, balancedFundsYearText, bondsCostBasisText, bondsCurrentBalanceText;
    private int bondsDayText, bondsMonthText, bondsYearText, checkingBalanceCostBasisText;
    private int checkingCurrentBalanceText, checkingDayText, checkingMonthText, checkingYearText;
    private int mBondsCurrentBalanceText, mBondsMonthText, mBondsDayText, mBondsYearText, mBondsCostBasis;
    private int rateOfReturnText, savingsCostBasisText, savingsDayText, savingsMonthText, savingsYearText;
    private int stocksCostBasisText, stocksCurrentBalanceText, stocksDayText, stocksMonthText, stocksYearText;
    private int savingsCurrentBalanceText;
    private boolean annuitiesFilled = false;

    private int assumedIncomeText2, balancedFundsCostBasisText2, balancedFundsCurrentBalanceText2, balancedFundsDayText2;
    private int balancedFundsMonthText2, balancedFundsYearText2, bondsCostBasisText2, bondsCurrentBalanceText2;
    private int bondsDayText2, bondsMonthText2, bondsYearText2, checkingBalanceCostBasisText2;
    private int checkingCurrentBalanceText2, checkingDayText2, checkingMonthText2, checkingYearText2;
    private int mBondsCurrentBalanceText2, mBondsMonthText2, mBondsDayText2, mBondsYearText2, mBondsCostBasis2;
    private int rateOfReturnText2, savingsCostBasisText2, savingsDayText2, savingsMonthText2, savingsYearText2;
    private int stocksCostBasisText2, stocksCurrentBalanceText2, stocksDayText2, stocksMonthText2, stocksYearText2;
    private int savingsCurrentBalanceText2;
    private boolean annuitiesFilled2 = false;
    
    
    
    //IRA info
    private int monthIra;
    private int dayIra;
    private int yearIra;
    private int contributionRothIra;
    private int contributionTraditionalIra;
    private int rothBalance;
    private int traditionalBalance;
    private int percentTraditional;
    private int percentRoth;
    private boolean balanceChosen;
    private String belongsToIra;
    private boolean iraFilled = false;
    private int monthIra2;
    private int dayIra2;
    private int yearIra2;
    private int contributionRothIra2;
    private int contributionTraditionalIra2;
    private int rothBalance2;
    private int traditionalBalance2;
    private int percentTraditional2;
    private int percentRoth2;
    private boolean balanceChosen2;
    private String belongsToIra2;
    private boolean iraFilled2 = false;
    private int monthIra3;
    private int dayIra3;
    private int yearIra3;
    private int contributionRothIra3;
    private int contributionTraditionalIra3;
    private int rothBalance3;
    private int traditionalBalance3;
    private int percentTraditional3;
    private int percentRoth3;
    private boolean balanceChosen3;
    private String belongsToIra3;
    private boolean iraFilled3 = false;
   
    
    //Options and grants info
    private int awardDay;
    private int awardMonth;
    private int awardYear;
    private int currentAmount;
    private int currentValue;
    private int expirationDay;
    private int expirationMonth;
    private int expirationYear;
    private int rateOfReturn;
    private boolean optionsGrantsFilled = false;
    private int awardDay2;
    private int awardMonth2;
    private int awardYear2;
    private int currentAmount2;
    private int currentValue2;
    private int expirationDay2;
    private int expirationMonth2;
    private int expirationYear2;
    private int rateOfReturn2;
    private boolean optionsGrantsFilled2 = false;
    private int awardDay3;
    private int awardMonth3;
    private int awardYear3;
    private int currentAmount3;
    private int currentValue3;
    private int expirationDay3;
    private int expirationMonth3;
    private int expirationYear3;
    private int rateOfReturn3;
    private boolean optionsGrantsFilled3 = false;

    
    
    //Pension Info
    private boolean clientRecievesLumpSumBool; 
    private boolean clientRecievesMonthlyBool;
    private int costOfLivingAdjustment;
    private int amountPension;
    private int pensionMonth;
    private int pensionDay;
    private int pensionYear;
    private boolean pensionFilled = false;
    private boolean clientRecievesLumpSumBool2; 
    private boolean clientRecievesMonthlyBool2;
    private int costOfLivingAdjustment2;
    private int amountPension2;
    private int pensionMonth2;
    private int pensionDay2;
    private int pensionYear2;
    private boolean pensionFilled2 = false;
    private boolean clientRecievesLumpSumBool3; 
    private boolean clientRecievesMonthlyBool3;
    private int costOfLivingAdjustment3;
    private int amountPension3;
    private int pensionMonth3;
    private int pensionDay3;
    private int pensionYear3;
    private boolean pensionFilled3 = false;
   
    
    //Regular Info 403B
    private int currentBalance403B;
    private int balanceMonth403B;
    private int balanceDay403B;
    private int balanceYear403B;
    private String contributionType403B;
    private int contributionBalance403B;
    private int contributionPercent403B;
    private int firstPercentMatchNum403B;
    private int firstPercentOfNum403B;
    private int secondPercentMatchNum403B;
    private int secondPercentOfNum403B;
    private int rateOfReturn403B;
    private boolean filled403B = false;
    private int currentBalance403B2;
    private int balanceMonth403B2;
    private int balanceDay403B2;
    private int balanceYear403B2;
    private String contributionType403B2;
    private int contributionBalance403B2;
    private int contributionPercent403B2;
    private int firstPercentMatchNum403B2;
    private int firstPercentOfNum403B2;
    private int secondPercentMatchNum403B2;
    private int secondPercentOfNum403B2;
    private int rateOfReturn403B2;
    private boolean filled403B2 = false;
    private int currentBalance403B3;
    private int balanceMonth403B3;
    private int balanceDay403B3;
    private int balanceYear403B3;
    private String contributionType403B3;
    private int contributionBalance403B3;
    private int contributionPercent403B3;
    private int firstPercentMatchNum403B3;
    private int firstPercentOfNum403B3;
    private int secondPercentMatchNum403B3;
    private int secondPercentOfNum403B3;
    private int rateOfReturn403B3;
    private boolean filled403B3 = false;
    
    //Regular Info HSA
    private int currentBalanceHSA;
    private int balanceMonthHSA;
    private int balanceDayHSA;
    private int balanceYearHSA;
    private String contributionTypeHSA;
    private int contributionBalanceHSA;
    private int contributionPercentHSA;
    private int firstPercentMatchNumHSA;
    private int firstPercentOfNumHSA;
    private int secondPercentMatchNumHSA;
    private int secondPercentOfNumHSA;
    private int rateOfReturnHSA;
    private boolean hsaFilled = false;
    private int currentBalanceHSA2;
    private int balanceMonthHSA2;
    private int balanceDayHSA2;
    private int balanceYearHSA2;
    private String contributionTypeHSA2;
    private int contributionBalanceHSA2;
    private int contributionPercentHSA2;
    private int firstPercentMatchNumHSA2;
    private int firstPercentOfNumHSA2;
    private int secondPercentMatchNumHSA2;
    private int secondPercentOfNumHSA2;
    private int rateOfReturnHSA2;
    private boolean hsaFilled2 = false;
    private int currentBalanceHSA3;
    private int balanceMonthHSA3;
    private int balanceDayHSA3;
    private int balanceYearHSA3;
    private String contributionTypeHSA3;
    private int contributionBalanceHSA3;
    private int contributionPercentHSA3;
    private int firstPercentMatchNumHSA3;
    private int firstPercentOfNumHSA3;
    private int secondPercentMatchNumHSA3;
    private int secondPercentOfNumHSA3;
    private int rateOfReturnHSA3;
    private boolean hsaFilled3 = false;
    
    //Regular Info 457
    private int currentBalance457;
    private int balanceMonth457;
    private int balanceDay457;
    private int balanceYear457;
    private String contributionType457;
    private int contributionBalance457;
    private int contributionPercent457;
    private int firstPercentMatchNum457;
    private int firstPercentOfNum457;
    private int secondPercentMatchNum457;
    private int secondPercentOfNum457;
    private int rateOfReturn457;
    private boolean filled457 = false;
    private int currentBalance4572;
    private int balanceMonth4572;
    private int balanceDay4572;
    private int balanceYear4572;
    private String contributionType4572;
    private int contributionBalance4572;
    private int contributionPercent4572;
    private int firstPercentMatchNum4572;
    private int firstPercentOfNum4572;
    private int secondPercentMatchNum4572;
    private int secondPercentOfNum4572;
    private int rateOfReturn4572;
    private boolean filled4572 = false;
    private int currentBalance4573;
    private int balanceMonth4573;
    private int balanceDay4573;
    private int balanceYear4573;
    private String contributionType4573;
    private int contributionBalance4573;
    private int contributionPercent4573;
    private int firstPercentMatchNum4573;
    private int firstPercentOfNum4573;
    private int secondPercentMatchNum4573;
    private int secondPercentOfNum4573;
    private int rateOfReturn4573;
    private boolean filled4573 = false;
    
    //Flexible Spending Info
    private int currentBalanceFlex;
    private int balanceMonthFlex;
    private int balanceDayFlex;
    private int balanceYearFlex;
    private String contributionTypeFlex;
    private int contributionBalanceFlex;
    private int contributionPercentFlex;
    private int firstPercentMatchNumFlex;
    private int firstPercentOfNumFlex;
    private int secondPercentMatchNumFlex;
    private int secondPercentOfNumFlex;
    private int rateOfReturnFlex;
    private boolean flexSpendFilled = false;
    private int currentBalanceFlex2;
    private int balanceMonthFlex2;
    private int balanceDayFlex2;
    private int balanceYearFlex2;
    private String contributionTypeFlex2;
    private int contributionBalanceFlex2;
    private int contributionPercentFlex2;
    private int firstPercentMatchNumFlex2;
    private int firstPercentOfNumFlex2;
    private int secondPercentMatchNumFlex2;
    private int secondPercentOfNumFlex2;
    private int rateOfReturnFlex2;
    private boolean flexSpendFilled2 = false;
    private int currentBalanceFlex3;
    private int balanceMonthFlex3;
    private int balanceDayFlex3;
    private int balanceYearFlex3;
    private String contributionTypeFlex3;
    private int contributionBalanceFlex3;
    private int contributionPercentFlex3;
    private int firstPercentMatchNumFlex3;
    private int firstPercentOfNumFlex3;
    private int secondPercentMatchNumFlex3;
    private int secondPercentOfNumFlex3;
    private int rateOfReturnFlex3;
    private boolean flexSpendFilled3 = false;
    
    //Social Security
    private boolean currentlyReceivingSS;
    private boolean ssAmountIsKnown;
    private int areFedTaxesWithheld;
    private int areStateTaxesWithheld;
    private boolean belongsToClient;
    private boolean belongsToSpouse;
    private boolean currentlyReceivingSS2;
    private boolean ssAmountIsKnown2;
    private int areFedTaxesWithheld2;
    private int areStateTaxesWithheld2;
    private boolean belongsToClient2;
    private boolean belongsToSpouse2;
    private int statePercentWithheldValue;
    private int ageRecievingBenefits;
    private int expectedMonthlyAmountValue;
    private int federalPercentWithheldValue;
    private int ssAmountValue;
    private boolean filledSS = false;
    private int statePercentWithheldValue2;
    private int ageRecievingBenefits2;
    private int expectedMonthlyAmountValue2;
    private int federalPercentWithheldValue2;
    private int ssAmountValue2;
    private boolean filledSS2 = false;
    
    
    private boolean currentlyReceivingSS3;
    private boolean ssAmountIsKnown3;
    private int areFedTaxesWithheld3;
    private int areStateTaxesWithheld3;
    private boolean belongsToClient3;
    private boolean belongsToSpouse3;
    private int statePercentWithheldValue3;
    private int ageRecievingBenefits3;
    private int expectedMonthlyAmountValue3;
    private int federalPercentWithheldValue3;
    private int ssAmountValue3;
    private boolean filledSS3 = false;
    
    //401K Information
    private int rothBalance401K;
    private int traditionalBalance401K;
    private int balanceMonth401K;
    private int balanceDay401K;
    private int balanceYear401K;
    private String contributionType401K;
    private int rothContributionBalance401K;
    private int traditionalContributionBalance401K;
    private int rothContributionPercent401K;
    private int traditionalContributionPercent401K;
    private int firstPercentMatchNum401K;
    private int firstPercentOfNum401K;
    private int secondPercentMatchNum401K;
    private int secondPercentOfNum401K;
    private int rateOfReturn401K;
    private String percentOrBalance;
    private boolean filled401K = false;
    private int rothBalance401K2;
    private int traditionalBalance401K2;
    private int balanceMonth401K2;
    private int balanceDay401K2;
    private int balanceYear401K2;
    private String contributionType401K2;
    private int rothContributionBalance401K2;
    private int traditionalContributionBalance401K2;
    private int rothContributionPercent401K2;
    private int traditionalContributionPercent401K2;
    private int firstPercentMatchNum401K2;
    private int firstPercentOfNum401K2;
    private int secondPercentMatchNum401K2;
    private int secondPercentOfNum401K2;
    private int rateOfReturn401K2;
    private String percentOrBalance2;
    private boolean filled401K2 = false;
    private int rothBalance401K3;
    private int traditionalBalance401K3;
    private int balanceMonth401K3;
    private int balanceDay401K3;
    private int balanceYear401K3;
    private String contributionType401K3;
    private int rothContributionBalance401K3;
    private int traditionalContributionBalance401K3;
    private int rothContributionPercent401K3;
    private int traditionalContributionPercent401K3;
    private int firstPercentMatchNum401K3;
    private int firstPercentOfNum401K3;
    private int secondPercentMatchNum401K3;
    private int secondPercentOfNum401K3;
    private int rateOfReturn401K3;
    private String percentOrBalance3;
    private boolean filled401K3 = false;
    
    
    
    
    
    
    public ClientProfile() {
        
        
        
    }
    
    

    public String getPercentOrBalance() {
        return percentOrBalance;
    }

    public String getPercentOrBalance2() {
        return percentOrBalance2;
    }

    public void setPercentOrBalance(String percentOrBalance) {
        this.percentOrBalance = percentOrBalance;
    }

    public void setPercentOrBalance2(String percentOrBalance2) {
        this.percentOrBalance2 = percentOrBalance2;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public void setRetirementMonth(int retirementMonth) {
        this.retirementMonth = retirementMonth;
    }

    public void setRetirementDay(int retirementDay) {
        this.retirementDay = retirementDay;
    }

    public void setRetirementYear(int retirementYear) {
        this.retirementYear = retirementYear;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setServiceMonth(int serviceMonth) {
        this.serviceMonth = serviceMonth;
    }

    public void setServiceDay(int serviceDay) {
        this.serviceDay = serviceDay;
    }

    public void setServiceYear(int serviceYear) {
        this.serviceYear = serviceYear;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public void setPercentPerDollar(double percentPerDollar) {
        this.percentPerDollar = percentPerDollar;
    }

    public void setMaxPercentOfWage(double maxPercentOfWage) {
        this.maxPercentOfWage = maxPercentOfWage;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAssumedIncomeText(int assumedIncomeText) {
        this.assumedIncomeText = assumedIncomeText;
    }

    public void setBalancedFundsCostBasisText(int balancedFundsCostBasisText) {
        this.balancedFundsCostBasisText = balancedFundsCostBasisText;
    }

    public void setBalancedFundsCurrentBalanceText(int balancedFundsCurrentBalanceText) {
        this.balancedFundsCurrentBalanceText = balancedFundsCurrentBalanceText;
    }

    public void setBalancedFundsDayText(int balancedFundsDayText) {
        this.balancedFundsDayText = balancedFundsDayText;
    }

    public void setBalancedFundsMonthText(int balancedFundsMonthText) {
        this.balancedFundsMonthText = balancedFundsMonthText;
    }

    public void setBalancedFundsYearText(int balancedFundsYearText) {
        this.balancedFundsYearText = balancedFundsYearText;
    }

    public void setBondsCostBasisText(int bondsCostBasisText) {
        this.bondsCostBasisText = bondsCostBasisText;
    }

    public void setBondsCurrentBalanceText(int bondsCurrentBalanceText) {
        this.bondsCurrentBalanceText = bondsCurrentBalanceText;
    }

    public void setBondsDayText(int bondsDayText) {
        this.bondsDayText = bondsDayText;
    }

    public void setBondsMonthText(int bondsMonthText) {
        this.bondsMonthText = bondsMonthText;
    }

    public void setBondsYearText(int bondsYearText) {
        this.bondsYearText = bondsYearText;
    }

    public void setCheckingBalanceCostBasisText(int checkingBalanceCostBasisText) {
        this.checkingBalanceCostBasisText = checkingBalanceCostBasisText;
    }

    public void setCheckingCurrentBalanceText(int checkingCurrentBalanceText) {
        this.checkingCurrentBalanceText = checkingCurrentBalanceText;
    }

    public void setCheckingDayText(int checkingDayText) {
        this.checkingDayText = checkingDayText;
    }

    public void setCheckingMonthText(int checkingMonthText) {
        this.checkingMonthText = checkingMonthText;
    }

    public void setCheckingYearText(int checkingYearText) {
        this.checkingYearText = checkingYearText;
    }

    public void setmBondsCurrentBalanceText(int mBondsCurrentBalanceText) {
        this.mBondsCurrentBalanceText = mBondsCurrentBalanceText;
    }

    public void setmBondsMonthText(int mBondsMonthText) {
        this.mBondsMonthText = mBondsMonthText;
    }

    public void setmBondsDayText(int mBondsDayText) {
        this.mBondsDayText = mBondsDayText;
    }

    public void setmBondsYearText(int mBondsYearText) {
        this.mBondsYearText = mBondsYearText;
    }

    public void setRateOfReturnText(int rateOfReturnText) {
        this.rateOfReturnText = rateOfReturnText;
    }

    public void setSavingsCostBasisText(int savingsCostBalanceText) {
        this.savingsCostBasisText = savingsCostBalanceText;
    }

    public void setSavingsDayText(int savingsDayText) {
        this.savingsDayText = savingsDayText;
    }

    public void setSavingsMonthText(int savingsMonthText) {
        this.savingsMonthText = savingsMonthText;
    }

    public void setSavingsYearText(int savingsYearText) {
        this.savingsYearText = savingsYearText;
    }

    public void setStocksCostBasisText(int stocksCostBasisText) {
        this.stocksCostBasisText = stocksCostBasisText;
    }

    public void setStocksCurrentBalanceText(int stocksCurrentBalanceText) {
        this.stocksCurrentBalanceText = stocksCurrentBalanceText;
    }

    public void setStocksDayText(int stocksDayText) {
        this.stocksDayText = stocksDayText;
    }

    public void setStocksMonthText(int stocksMonthText) {
        this.stocksMonthText = stocksMonthText;
    }

    public void setStocksYearText(int stocksYearText) {
        this.stocksYearText = stocksYearText;
    }

    public void setMonthIra(int monthIra) {
        this.monthIra = monthIra;
    }

    public void setDayIra(int dayIra) {
        this.dayIra = dayIra;
    }

    public void setYearIra(int yearIra) {
        this.yearIra = yearIra;
    }

    public void setContributionRothIra(int contributionRothIra) {
        this.contributionRothIra = contributionRothIra;
    }

    public void setContributionTraditionalIra(int contributionTraditionalIra) {
        this.contributionTraditionalIra = contributionTraditionalIra;
    }

    public void setRothBalance(int rothBalance) {
        this.rothBalance = rothBalance;
    }

    public void setTraditionalBalance(int traditionalBalance) {
        this.traditionalBalance = traditionalBalance;
    }

    public void setMonthIra2(int monthIra2) {
        this.monthIra2 = monthIra2;
    }

    public void setDayIra2(int dayIra2) {
        this.dayIra2 = dayIra2;
    }

    public void setYearIra2(int yearIra2) {
        this.yearIra2 = yearIra2;
    }

    public void setContributionRothIra2(int contributionRothIra2) {
        this.contributionRothIra2 = contributionRothIra2;
    }

    public void setContributionTraditionalIra2(int contributionTraditionalIra2) {
        this.contributionTraditionalIra2 = contributionTraditionalIra2;
    }

    public void setRothBalance2(int rothBalance2) {
        this.rothBalance2 = rothBalance2;
    }

    public void setTraditionalBalance2(int traditionalBalance2) {
        this.traditionalBalance2 = traditionalBalance2;
    }

    public void setAwardDay(int awardDay) {
        this.awardDay = awardDay;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setAwardMonth(int awardMonth) {
        this.awardMonth = awardMonth;
    }

    public void setAwardYear(int awardYear) {
        this.awardYear = awardYear;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getBelongsToIra() {
        return belongsToIra;
    }

    public String getBelongsToIra2() {
        return belongsToIra2;
    }

    public void setBelongsToIra(String belongsToIra) {
        this.belongsToIra = belongsToIra;
    }

    public void setBelongsToIra2(String belongsToIra2) {
        this.belongsToIra2 = belongsToIra2;
    }

    
    
    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public void setExpirationDay(int expirationDay) {
        this.expirationDay = expirationDay;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setAwardDay2(int awardDay2) {
        this.awardDay2 = awardDay2;
    }

    public void setAwardMonth2(int awardMonth2) {
        this.awardMonth2 = awardMonth2;
    }

    public void setAwardYear2(int awardYear2) {
        this.awardYear2 = awardYear2;
    }

    public void setCurrentAmount2(int currentAmount2) {
        this.currentAmount2 = currentAmount2;
    }

    public void setCurrentValue2(int currentValue2) {
        this.currentValue2 = currentValue2;
    }

    public void setExpirationDay2(int expirationDay2) {
        this.expirationDay2 = expirationDay2;
    }

    public void setExpirationMonth2(int expirationMonth2) {
        this.expirationMonth2 = expirationMonth2;
    }

    public void setExpirationYear2(int expirationYear2) {
        this.expirationYear2 = expirationYear2;
    }

    public void setClientRecievesLumpSumBool(boolean clientRecievesLumpSumBool) {
        this.clientRecievesLumpSumBool = clientRecievesLumpSumBool;
    }

    public void setClientRecievesMonthlyBool(boolean clientRecievesMonthlyBool) {
        this.clientRecievesMonthlyBool = clientRecievesMonthlyBool;
    }

    public void setCostOfLivingAdjustment(int costOfLivingAdjustment) {
        this.costOfLivingAdjustment = costOfLivingAdjustment;
    }

    public void setClientRecievesLumpSumBool2(boolean clientRecievesLumpSumBool2) {
        this.clientRecievesLumpSumBool2 = clientRecievesLumpSumBool2;
    }

    public void setClientRecievesMonthlyBool2(boolean clientRecievesMonthlyBool2) {
        this.clientRecievesMonthlyBool2 = clientRecievesMonthlyBool2;
    }

    public void setCostOfLivingAdjustment2(int costOfLivingAdjustment2) {
        this.costOfLivingAdjustment2 = costOfLivingAdjustment2;
    }

    public void setCurrentBalance403B(int currentBalance403B) {
        this.currentBalance403B = currentBalance403B;
    }

    public void setBalanceMonth403B(int balanceMonth403B) {
        this.balanceMonth403B = balanceMonth403B;
    }

    public void setBalanceDay403B(int balanceDay403B) {
        this.balanceDay403B = balanceDay403B;
    }

    public void setBalanceYear403B(int balanceYear403B) {
        this.balanceYear403B = balanceYear403B;
    }

    public void setContributionType403B(String contributionType403B) {
        this.contributionType403B = contributionType403B;
    }

    public void setContributionBalance403B(int contributionBalance403B) {
        this.contributionBalance403B = contributionBalance403B;
    }

    public void setContributionPercent403B(int contributionPercent403B) {
        this.contributionPercent403B = contributionPercent403B;
    }

    public int getmBondsCostBasis() {
        return mBondsCostBasis;
    }

    public void setmBondsCostBasis(int mBondsCostBasis) {
        this.mBondsCostBasis = mBondsCostBasis;
    }

    public int getStatePercentWithheldValue() {
        return statePercentWithheldValue;
    }

    public int getAgeRecievingBenefits() {
        return ageRecievingBenefits;
    }

    public int getExpectedMonthlyAmountValue() {
        return expectedMonthlyAmountValue;
    }

    public int getFederalPercentWithheldValue() {
        return federalPercentWithheldValue;
    }

    public int getSsAmountValue() {
        return ssAmountValue;
    }

    public int getStatePercentWithheldValue2() {
        return statePercentWithheldValue2;
    }

    public int getAgeRecievingBenefits2() {
        return ageRecievingBenefits2;
    }

    public int getExpectedMonthlyAmountValue2() {
        return expectedMonthlyAmountValue2;
    }

    public int getFederalPercentWithheldValue2() {
        return federalPercentWithheldValue2;
    }

    public int getSsAmountValue2() {
        return ssAmountValue2;
    }

    public void setStatePercentWithheldValue(int statePercentWithheldValue) {
        this.statePercentWithheldValue = statePercentWithheldValue;
    }

    public void setAgeRecievingBenefits(int ageRecievingBenefits) {
        this.ageRecievingBenefits = ageRecievingBenefits;
    }

    public void setExpectedMonthlyAmountValue(int expectedMonthlyAmountValue) {
        this.expectedMonthlyAmountValue = expectedMonthlyAmountValue;
    }

    public void setFederalPercentWithheldValue(int federalPercentWithheldValue) {
        this.federalPercentWithheldValue = federalPercentWithheldValue;
    }

    public void setSsAmountValue(int ssAmountValue) {
        this.ssAmountValue = ssAmountValue;
    }

    public void setStatePercentWithheldValue2(int statePercentWithheldValue2) {
        this.statePercentWithheldValue2 = statePercentWithheldValue2;
    }

    public void setAgeRecievingBenefits2(int ageRecievingBenefits2) {
        this.ageRecievingBenefits2 = ageRecievingBenefits2;
    }

    public void setExpectedMonthlyAmountValue2(int expectedMonthlyAmountValue2) {
        this.expectedMonthlyAmountValue2 = expectedMonthlyAmountValue2;
    }

    public void setFederalPercentWithheldValue2(int federalPercentWithheldValue2) {
        this.federalPercentWithheldValue2 = federalPercentWithheldValue2;
    }

    public void setSsAmountValue2(int ssAmountValue2) {
        this.ssAmountValue2 = ssAmountValue2;
    }
    
    

    public void setFirstPercentMatchNum403B(int firstPercentMatchNum403B) {
        this.firstPercentMatchNum403B = firstPercentMatchNum403B;
    }

    public void setFirstPercentOfNum403B(int firstPercentOfNum403B) {
        this.firstPercentOfNum403B = firstPercentOfNum403B;
    }

    public void setSecondPercentMatchNum403B(int secondPercentMatchNum403B) {
        this.secondPercentMatchNum403B = secondPercentMatchNum403B;
    }

    public void setSecondPercentOfNum403B(int secondPercentOfNum403B) {
        this.secondPercentOfNum403B = secondPercentOfNum403B;
    }

    public void setRateOfReturn403B(int rateOfReturn403B) {
        this.rateOfReturn403B = rateOfReturn403B;
    }

    public void setCurrentBalance403B2(int currentBalance403B2) {
        this.currentBalance403B2 = currentBalance403B2;
    }

    public void setBalanceMonth403B2(int balanceMonth403B2) {
        this.balanceMonth403B2 = balanceMonth403B2;
    }

    public void setBalanceDay403B2(int balanceDay403B2) {
        this.balanceDay403B2 = balanceDay403B2;
    }

    public void setBalanceYear403B2(int balanceYear403B2) {
        this.balanceYear403B2 = balanceYear403B2;
    }

    public void setContributionType403B2(String contributionType403B2) {
        this.contributionType403B2 = contributionType403B2;
    }

    public void setContributionBalance403B2(int contributionBalance403B2) {
        this.contributionBalance403B2 = contributionBalance403B2;
    }

    public void setContributionPercent403B2(int contributionPercent403B2) {
        this.contributionPercent403B2 = contributionPercent403B2;
    }

    public void setFirstPercentMatchNum403B2(int firstPercentMatchNum403B2) {
        this.firstPercentMatchNum403B2 = firstPercentMatchNum403B2;
    }

    public void setFirstPercentOfNum403B2(int firstPercentOfNum403B2) {
        this.firstPercentOfNum403B2 = firstPercentOfNum403B2;
    }

    public void setSecondPercentMatchNum403B2(int secondPercentMatchNum403B2) {
        this.secondPercentMatchNum403B2 = secondPercentMatchNum403B2;
    }

    public void setSecondPercentOfNum403B2(int secondPercentOfNum403B2) {
        this.secondPercentOfNum403B2 = secondPercentOfNum403B2;
    }

    public void setRateOfReturn403B2(int rateOfReturn403B2) {
        this.rateOfReturn403B2 = rateOfReturn403B2;
    }

    public void setCurrentBalanceHSA(int currentBalanceHSA) {
        this.currentBalanceHSA = currentBalanceHSA;
    }

    public void setBalanceMonthHSA(int balanceMonthHSA) {
        this.balanceMonthHSA = balanceMonthHSA;
    }

    public void setBalanceDayHSA(int balanceDayHSA) {
        this.balanceDayHSA = balanceDayHSA;
    }

    public void setBalanceYearHSA(int balanceYearHSA) {
        this.balanceYearHSA = balanceYearHSA;
    }

    public void setContributionTypeHSA(String contributionTypeHSA) {
        this.contributionTypeHSA = contributionTypeHSA;
    }

    public void setContributionBalanceHSA(int contributionBalanceHSA) {
        this.contributionBalanceHSA = contributionBalanceHSA;
    }

    public void setContributionPercentHSA(int contributionPercentHSA) {
        this.contributionPercentHSA = contributionPercentHSA;
    }

    public void setFirstPercentMatchNumHSA(int firstPercentMatchNumHSA) {
        this.firstPercentMatchNumHSA = firstPercentMatchNumHSA;
    }

    public void setFirstPercentOfNumHSA(int firstPercentOfNumHSA) {
        this.firstPercentOfNumHSA = firstPercentOfNumHSA;
    }

    public void setSecondPercentMatchNumHSA(int secondPercentMatchNumHSA) {
        this.secondPercentMatchNumHSA = secondPercentMatchNumHSA;
    }

    public void setRateOfReturn2(int rateOfReturn2) {
        this.rateOfReturn2 = rateOfReturn2;
    }

    public int getRateOfReturn2() {
        return rateOfReturn2;
    }
    
    public void setSecondPercentOfNumHSA(int secondPercentOfNumHSA) {
        this.secondPercentOfNumHSA = secondPercentOfNumHSA;
    }

    public void setRateOfReturnHSA(int rateOfReturnHSA) {
        this.rateOfReturnHSA = rateOfReturnHSA;
    }

    public void setCurrentBalanceHSA2(int currentBalanceHSA2) {
        this.currentBalanceHSA2 = currentBalanceHSA2;
    }

    public void setBalanceMonthHSA2(int balanceMonthHSA2) {
        this.balanceMonthHSA2 = balanceMonthHSA2;
    }

    public void setBalanceDayHSA2(int balanceDayHSA2) {
        this.balanceDayHSA2 = balanceDayHSA2;
    }

    public void setBalanceYearHSA2(int balanceYearHSA2) {
        this.balanceYearHSA2 = balanceYearHSA2;
    }

    public void setContributionTypeHSA2(String contributionTypeHSA2) {
        this.contributionTypeHSA2 = contributionTypeHSA2;
    }

    public void setContributionBalanceHSA2(int contributionBalanceHSA2) {
        this.contributionBalanceHSA2 = contributionBalanceHSA2;
    }

    public void setContributionPercentHSA2(int contributionPercentHSA2) {
        this.contributionPercentHSA2 = contributionPercentHSA2;
    }

    public void setFirstPercentMatchNumHSA2(int firstPercentMatchNumHSA2) {
        this.firstPercentMatchNumHSA2 = firstPercentMatchNumHSA2;
    }

    public void setFirstPercentOfNumHSA2(int firstPercentOfNumHSA2) {
        this.firstPercentOfNumHSA2 = firstPercentOfNumHSA2;
    }

    public void setSecondPercentMatchNumHSA2(int secondPercentMatchNumHSA2) {
        this.secondPercentMatchNumHSA2 = secondPercentMatchNumHSA2;
    }

    public void setSecondPercentOfNumHSA2(int secondPercentOfNumHSA2) {
        this.secondPercentOfNumHSA2 = secondPercentOfNumHSA2;
    }

    public void setRateOfReturnHSA2(int rateOfReturnHSA2) {
        this.rateOfReturnHSA2 = rateOfReturnHSA2;
    }

    public void setCurrentBalance457(int currentBalance457) {
        this.currentBalance457 = currentBalance457;
    }

    public void setBalanceMonth457(int balanceMonth457) {
        this.balanceMonth457 = balanceMonth457;
    }

    public void setBalanceDay457(int balanceDay457) {
        this.balanceDay457 = balanceDay457;
    }

    public int getAmountPension() {
        return amountPension;
    }

    public int getAmountPension2() {
        return amountPension2;
    }

    public void setAmountPension(int amountPension) {
        this.amountPension = amountPension;
    }

    public void setAmountPension2(int amountPension2) {
        this.amountPension2 = amountPension2;
    }

    
    
    
    public void setBalanceYear457(int balanceYear457) {
        this.balanceYear457 = balanceYear457;
    }

    public void setContributionType457(String contributionType457) {
        this.contributionType457 = contributionType457;
    }

    public void setContributionBalance457(int contributionBalance457) {
        this.contributionBalance457 = contributionBalance457;
    }

    public void setContributionPercent457(int contributionPercent457) {
        this.contributionPercent457 = contributionPercent457;
    }

    public void setFirstPercentMatchNum457(int firstPercentMatchNum457) {
        this.firstPercentMatchNum457 = firstPercentMatchNum457;
    }

    public void setFirstPercentOfNum457(int firstPercentOfNum457) {
        this.firstPercentOfNum457 = firstPercentOfNum457;
    }

    public void setSecondPercentMatchNum457(int secondPercentMatchNum457) {
        this.secondPercentMatchNum457 = secondPercentMatchNum457;
    }

    public void setSecondPercentOfNum457(int secondPercentOfNum457) {
        this.secondPercentOfNum457 = secondPercentOfNum457;
    }

    public void setRateOfReturn457(int rateOfReturn457) {
        this.rateOfReturn457 = rateOfReturn457;
    }

    public void setCurrentBalance4572(int currentBalance4572) {
        this.currentBalance4572 = currentBalance4572;
    }

    public void setBalanceMonth4572(int balanceMonth4572) {
        this.balanceMonth4572 = balanceMonth4572;
    }

    public void setBalanceDay4572(int balanceDay4572) {
        this.balanceDay4572 = balanceDay4572;
    }

    public void setBalanceYear4572(int balanceYear4572) {
        this.balanceYear4572 = balanceYear4572;
    }

    public void setContributionType4572(String contributionType4572) {
        this.contributionType4572 = contributionType4572;
    }

    public void setContributionBalance4572(int contributionBalance4572) {
        this.contributionBalance4572 = contributionBalance4572;
    }

    public void setContributionPercent4572(int contributionPercent4572) {
        this.contributionPercent4572 = contributionPercent4572;
    }

    public void setFirstPercentMatchNum4572(int firstPercentMatchNum4572) {
        this.firstPercentMatchNum4572 = firstPercentMatchNum4572;
    }

    public void setFirstPercentOfNum4572(int firstPercentOfNum4572) {
        this.firstPercentOfNum4572 = firstPercentOfNum4572;
    }

    public int getRateOfReturn() {
        return rateOfReturn;
    }

    public void setRateOfReturn(int rateOfReturn) {
        this.rateOfReturn = rateOfReturn;
    }

    
    
    public void setSecondPercentMatchNum4572(int secondPercentMatchNum4572) {
        this.secondPercentMatchNum4572 = secondPercentMatchNum4572;
    }

    public void setSecondPercentOfNum4572(int secondPercentOfNum4572) {
        this.secondPercentOfNum4572 = secondPercentOfNum4572;
    }

    public void setRateOfReturn4572(int rateOfReturn4572) {
        this.rateOfReturn4572 = rateOfReturn4572;
    }

    public void setCurrentBalanceFlex(int currentBalanceFlex) {
        this.currentBalanceFlex = currentBalanceFlex;
    }

    public void setBalanceMonthFlex(int balanceMonthFlex) {
        this.balanceMonthFlex = balanceMonthFlex;
    }

    public void setBalanceDayFlex(int balanceDayFlex) {
        this.balanceDayFlex = balanceDayFlex;
    }

    public void setBalanceYearFlex(int balanceYearFlex) {
        this.balanceYearFlex = balanceYearFlex;
    }

    public void setContributionTypeFlex(String contributionTypeFlex) {
        this.contributionTypeFlex = contributionTypeFlex;
    }

    public void setContributionBalanceFlex(int contributionBalanceFlex) {
        this.contributionBalanceFlex = contributionBalanceFlex;
    }

    public void setContributionPercentFlex(int contributionPercentFlex) {
        this.contributionPercentFlex = contributionPercentFlex;
    }

    public void setFirstPercentMatchNumFlex(int firstPercentMatchNumFlex) {
        this.firstPercentMatchNumFlex = firstPercentMatchNumFlex;
    }

    public void setFirstPercentOfNumFlex(int firstPercentOfNumFlex) {
        this.firstPercentOfNumFlex = firstPercentOfNumFlex;
    }

    public void setSecondPercentMatchNumFlex(int secondPercentMatchNumFlex) {
        this.secondPercentMatchNumFlex = secondPercentMatchNumFlex;
    }

    public void setSecondPercentOfNumFlex(int secondPercentOfNumFlex) {
        this.secondPercentOfNumFlex = secondPercentOfNumFlex;
    }

    public void setRateOfReturnFlex(int rateOfReturnFlex) {
        this.rateOfReturnFlex = rateOfReturnFlex;
    }

    public void setCurrentBalanceFlex2(int currentBalanceFlex2) {
        this.currentBalanceFlex2 = currentBalanceFlex2;
    }

    public void setBalanceMonthFlex2(int balanceMonthFlex2) {
        this.balanceMonthFlex2 = balanceMonthFlex2;
    }

    public void setBalanceDayFlex2(int balanceDayFlex2) {
        this.balanceDayFlex2 = balanceDayFlex2;
    }

    public void setBalanceYearFlex2(int balanceYearFlex2) {
        this.balanceYearFlex2 = balanceYearFlex2;
    }

    public void setContributionTypeFlex2(String contributionTypeFlex2) {
        this.contributionTypeFlex2 = contributionTypeFlex2;
    }

    public void setContributionBalanceFlex2(int contributionBalanceFlex2) {
        this.contributionBalanceFlex2 = contributionBalanceFlex2;
    }

    public void setContributionPercentFlex2(int contributionPercentFlex2) {
        this.contributionPercentFlex2 = contributionPercentFlex2;
    }

    public void setFirstPercentMatchNumFlex2(int firstPercentMatchNumFlex2) {
        this.firstPercentMatchNumFlex2 = firstPercentMatchNumFlex2;
    }

    public void setFirstPercentOfNumFlex2(int firstPercentOfNumFlex2) {
        this.firstPercentOfNumFlex2 = firstPercentOfNumFlex2;
    }

    public void setSecondPercentMatchNumFlex2(int secondPercentMatchNumFlex2) {
        this.secondPercentMatchNumFlex2 = secondPercentMatchNumFlex2;
    }

    public void setSecondPercentOfNumFlex2(int secondPercentOfNumFlex2) {
        this.secondPercentOfNumFlex2 = secondPercentOfNumFlex2;
    }

    public void setRateOfReturnFlex2(int rateOfReturnFlex2) {
        this.rateOfReturnFlex2 = rateOfReturnFlex2;
    }

    public void setCurrentlyReceivingSS(boolean currentlyReceivingSS) {
        this.currentlyReceivingSS = currentlyReceivingSS;
    }

    public void setSsAmountIsKnown(boolean ssAmountIsKnown) {
        this.ssAmountIsKnown = ssAmountIsKnown;
    }

    public void setAreFedTaxesWithheld(int areFedTaxesWithheld) {
        this.areFedTaxesWithheld = areFedTaxesWithheld;
    }

    public void setAreStateTaxesWithheld(int areStateTaxesWithheld) {
        this.areStateTaxesWithheld = areStateTaxesWithheld;
    }

    public void setBelongsToClient(boolean belongsToClient) {
        this.belongsToClient = belongsToClient;
    }

    public void setBelongsToSpouse(boolean belongsToSpouse) {
        this.belongsToSpouse = belongsToSpouse;
    }

    public void setCurrentlyReceivingSS2(boolean currentlyReceivingSS2) {
        this.currentlyReceivingSS2 = currentlyReceivingSS2;
    }

    public void setSsAmountIsKnown2(boolean ssAmountIsKnown2) {
        this.ssAmountIsKnown2 = ssAmountIsKnown2;
    }

    public void setAreFedTaxesWithheld2(int areFedTaxesWithheld2) {
        this.areFedTaxesWithheld2 = areFedTaxesWithheld2;
    }

    public void setAreStateTaxesWithheld2(int areStateTaxesWithheld2) {
        this.areStateTaxesWithheld2 = areStateTaxesWithheld2;
    }

    public void setBelongsToClient2(boolean belongsToClient2) {
        this.belongsToClient2 = belongsToClient2;
    }

    public void setBelongsToSpouse2(boolean belongsToSpouse2) {
        this.belongsToSpouse2 = belongsToSpouse2;
    }

    public void setRothBalance401K(int rothBalance401K) {
        this.rothBalance401K = rothBalance401K;
    }

    public void setTraditionalBalance401K(int traditionalBalance401K) {
        this.traditionalBalance401K = traditionalBalance401K;
    }

    public void setBalanceMonth401K(int balanceMonth401K) {
        this.balanceMonth401K = balanceMonth401K;
    }

    public void setBalanceDay401K(int balanceDay401K) {
        this.balanceDay401K = balanceDay401K;
    }

    public void setBalanceYear401K(int balanceYear401K) {
        this.balanceYear401K = balanceYear401K;
    }

    public void setContributionType401K(String contributionType401K) {
        this.contributionType401K = contributionType401K;
    }

    public void setRothContributionBalance401K(int rothContributionBalance401K) {
        this.rothContributionBalance401K = rothContributionBalance401K;
    }

    public void setTraditionalContributionBalance401K(int traditionalContributionBalance401K) {
        this.traditionalContributionBalance401K = traditionalContributionBalance401K;
    }

    public void setRothContributionPercent401K(int rothContributionPercent401K) {
        this.rothContributionPercent401K = rothContributionPercent401K;
    }

    public void setTraditionalContributionPercent401K(int traditionalContributionPercent401K) {
        this.traditionalContributionPercent401K = traditionalContributionPercent401K;
    }

    public void setFirstPercentMatchNum401K(int firstPercentMatchNum401K) {
        this.firstPercentMatchNum401K = firstPercentMatchNum401K;
    }

    public void setFirstPercentOfNum401K(int firstPercentOfNum401K) {
        this.firstPercentOfNum401K = firstPercentOfNum401K;
    }

    public void setSecondPercentMatchNum401K(int secondPercentMatchNum401K) {
        this.secondPercentMatchNum401K = secondPercentMatchNum401K;
    }

    public void setSecondPercentOfNum401K(int secondPercentOfNum401K) {
        this.secondPercentOfNum401K = secondPercentOfNum401K;
    }

    public void setRateOfReturn401K(int rateOfReturn401K) {
        this.rateOfReturn401K = rateOfReturn401K;
    }

    public void setRothBalance401K2(int rothBalance401K2) {
        this.rothBalance401K2 = rothBalance401K2;
    }

    public void setTraditionalBalance401K2(int traditionalBalance401K2) {
        this.traditionalBalance401K2 = traditionalBalance401K2;
    }

    public void setBalanceMonth401K2(int balanceMonth401K2) {
        this.balanceMonth401K2 = balanceMonth401K2;
    }

    public void setBalanceDay401K2(int balanceDay401K2) {
        this.balanceDay401K2 = balanceDay401K2;
    }

    public void setBalanceYear401K2(int balanceYear401K2) {
        this.balanceYear401K2 = balanceYear401K2;
    }

    public void setContributionType401K2(String contributionType401K2) {
        this.contributionType401K2 = contributionType401K2;
    }

    public void setRothContributionBalance401K2(int rothContributionBalance401K2) {
        this.rothContributionBalance401K2 = rothContributionBalance401K2;
    }

    public void setTraditionalContributionBalance401K2(int traditionalContributionBalance401K2) {
        this.traditionalContributionBalance401K2 = traditionalContributionBalance401K2;
    }

    public void setRothContributionPercent401K2(int rothContributionPercent401K2) {
        this.rothContributionPercent401K2 = rothContributionPercent401K2;
    }

    public void setTraditionalContributionPercent401K2(int traditionalContributionPercent401K2) {
        this.traditionalContributionPercent401K2 = traditionalContributionPercent401K2;
    }

    public void setFirstPercentMatchNum401K2(int firstPercentMatchNum401K2) {
        this.firstPercentMatchNum401K2 = firstPercentMatchNum401K2;
    }

    public void setFirstPercentOfNum401K2(int firstPercentOfNum401K2) {
        this.firstPercentOfNum401K2 = firstPercentOfNum401K2;
    }

    public void setSecondPercentMatchNum401K2(int secondPercentMatchNum401K2) {
        this.secondPercentMatchNum401K2 = secondPercentMatchNum401K2;
    }

    public void setSecondPercentOfNum401K2(int secondPercentOfNum401K2) {
        this.secondPercentOfNum401K2 = secondPercentOfNum401K2;
    }

    public void setRateOfReturn401K2(int rateOfReturn401K2) {
        this.rateOfReturn401K2 = rateOfReturn401K2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public int getRetirementMonth() {
        return retirementMonth;
    }

    public int getRetirementDay() {
        return retirementDay;
    }

    public int getRetirementYear() {
        return retirementYear;
    }

    public String getCompany() {
        return company;
    }

    public int getServiceMonth() {
        return serviceMonth;
    }

    public int getServiceDay() {
        return serviceDay;
    }

    public int getServiceYear() {
        return serviceYear;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public double getPercentPerDollar() {
        return percentPerDollar;
    }

    public double getMaxPercentOfWage() {
        return maxPercentOfWage;
    }

    public int getAge() {
        return age;
    }

    public int getAssumedIncomeText() {
        return assumedIncomeText;
    }

    public int getBalancedFundsCostBasisText() {
        return balancedFundsCostBasisText;
    }

    public int getBalancedFundsCurrentBalanceText() {
        return balancedFundsCurrentBalanceText;
    }

    public int getBalancedFundsDayText() {
        return balancedFundsDayText;
    }

    public int getBalancedFundsMonthText() {
        return balancedFundsMonthText;
    }

    public int getBalancedFundsYearText() {
        return balancedFundsYearText;
    }

    public int getBondsCostBasisText() {
        return bondsCostBasisText;
    }

    public int getBondsCurrentBalanceText() {
        return bondsCurrentBalanceText;
    }

    public int getBondsDayText() {
        return bondsDayText;
    }

    public int getBondsMonthText() {
        return bondsMonthText;
    }

    public int getBondsYearText() {
        return bondsYearText;
    }

    public int getCheckingBalanceCostBasisText() {
        return checkingBalanceCostBasisText;
    }

    public int getCheckingCurrentBalanceText() {
        return checkingCurrentBalanceText;
    }

    public int getCheckingDayText() {
        return checkingDayText;
    }

    public int getCheckingMonthText() {
        return checkingMonthText;
    }

    public int getCheckingYearText() {
        return checkingYearText;
    }

    public int getmBondsCurrentBalanceText() {
        return mBondsCurrentBalanceText;
    }

    public int getmBondsMonthText() {
        return mBondsMonthText;
    }

    public int getmBondsDayText() {
        return mBondsDayText;
    }

    public int getmBondsYearText() {
        return mBondsYearText;
    }

    public int getRateOfReturnText() {
        return rateOfReturnText;
    }

    public int getSavingsCostBasisText() {
        return savingsCostBasisText;
    }

    public int getSavingsDayText() {
        return savingsDayText;
    }

    public int getSavingsMonthText() {
        return savingsMonthText;
    }

    public int getSavingsYearText() {
        return savingsYearText;
    }

    public int getStocksCostBasisText() {
        return stocksCostBasisText;
    }

    public int getStocksCurrentBalanceText() {
        return stocksCurrentBalanceText;
    }

    public int getStocksDayText() {
        return stocksDayText;
    }

    public int getStocksMonthText() {
        return stocksMonthText;
    }

    public int getStocksYearText() {
        return stocksYearText;
    }

    public int getMonthIra() {
        return monthIra;
    }

    public int getDayIra() {
        return dayIra;
    }

    public int getYearIra() {
        return yearIra;
    }

    public int getContributionRothIra() {
        return contributionRothIra;
    }

    public int getContributionTraditionalIra() {
        return contributionTraditionalIra;
    }

    public int getRothBalance() {
        return rothBalance;
    }

    public int getTraditionalBalance() {
        return traditionalBalance;
    }

    public int getMonthIra2() {
        return monthIra2;
    }

    public int getDayIra2() {
        return dayIra2;
    }

    public int getYearIra2() {
        return yearIra2;
    }

    public int getContributionRothIra2() {
        return contributionRothIra2;
    }

    public int getContributionTraditionalIra2() {
        return contributionTraditionalIra2;
    }

    public int getRothBalance2() {
        return rothBalance2;
    }

    public int getTraditionalBalance2() {
        return traditionalBalance2;
    }

    public int getAwardDay() {
        return awardDay;
    }

    public int getAwardMonth() {
        return awardMonth;
    }

    public int getAwardYear() {
        return awardYear;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getExpirationDay() {
        return expirationDay;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public int getAwardDay2() {
        return awardDay2;
    }

    public int getAwardMonth2() {
        return awardMonth2;
    }

    public int getAwardYear2() {
        return awardYear2;
    }

    public int getCurrentAmount2() {
        return currentAmount2;
    }

    public int getCurrentValue2() {
        return currentValue2;
    }

    public int getExpirationDay2() {
        return expirationDay2;
    }

    public int getExpirationMonth2() {
        return expirationMonth2;
    }

    public int getExpirationYear2() {
        return expirationYear2;
    }

    public boolean isClientRecievesLumpSumBool() {
        return clientRecievesLumpSumBool;
    }

    public boolean isClientRecievesMonthlyBool() {
        return clientRecievesMonthlyBool;
    }

    public int getCostOfLivingAdjustment() {
        return costOfLivingAdjustment;
    }

    public boolean isClientRecievesLumpSumBool2() {
        return clientRecievesLumpSumBool2;
    }

    public boolean isClientRecievesMonthlyBool2() {
        return clientRecievesMonthlyBool2;
    }

    public int getCostOfLivingAdjustment2() {
        return costOfLivingAdjustment2;
    }

    public int getCurrentBalance403B() {
        return currentBalance403B;
    }

    public int getBalanceMonth403B() {
        return balanceMonth403B;
    }

    public int getBalanceDay403B() {
        return balanceDay403B;
    }

    public int getBalanceYear403B() {
        return balanceYear403B;
    }

    public String getContributionType403B() {
        return contributionType403B;
    }

    public int getContributionBalance403B() {
        return contributionBalance403B;
    }

    public int getContributionPercent403B() {
        return contributionPercent403B;
    }

    public int getFirstPercentMatchNum403B() {
        return firstPercentMatchNum403B;
    }

    public int getFirstPercentOfNum403B() {
        return firstPercentOfNum403B;
    }

    public int getSecondPercentMatchNum403B() {
        return secondPercentMatchNum403B;
    }

    public int getSecondPercentOfNum403B() {
        return secondPercentOfNum403B;
    }

    public int getRateOfReturn403B() {
        return rateOfReturn403B;
    }

    public int getCurrentBalance403B2() {
        return currentBalance403B2;
    }

    public int getBalanceMonth403B2() {
        return balanceMonth403B2;
    }

    public int getBalanceDay403B2() {
        return balanceDay403B2;
    }

    public int getBalanceYear403B2() {
        return balanceYear403B2;
    }

    public String getContributionType403B2() {
        return contributionType403B2;
    }

    public int getContributionBalance403B2() {
        return contributionBalance403B2;
    }

    public int getContributionPercent403B2() {
        return contributionPercent403B2;
    }

    public int getFirstPercentMatchNum403B2() {
        return firstPercentMatchNum403B2;
    }

    public int getFirstPercentOfNum403B2() {
        return firstPercentOfNum403B2;
    }

    public int getSecondPercentMatchNum403B2() {
        return secondPercentMatchNum403B2;
    }

    public int getSecondPercentOfNum403B2() {
        return secondPercentOfNum403B2;
    }

    public int getRateOfReturn403B2() {
        return rateOfReturn403B2;
    }

    public int getCurrentBalanceHSA() {
        return currentBalanceHSA;
    }

    public int getBalanceMonthHSA() {
        return balanceMonthHSA;
    }

    public int getBalanceDayHSA() {
        return balanceDayHSA;
    }

    public int getBalanceYearHSA() {
        return balanceYearHSA;
    }

    public String getContributionTypeHSA() {
        return contributionTypeHSA;
    }

    public int getContributionBalanceHSA() {
        return contributionBalanceHSA;
    }

    public int getContributionPercentHSA() {
        return contributionPercentHSA;
    }

    public int getFirstPercentMatchNumHSA() {
        return firstPercentMatchNumHSA;
    }

    public int getFirstPercentOfNumHSA() {
        return firstPercentOfNumHSA;
    }

    public int getSecondPercentMatchNumHSA() {
        return secondPercentMatchNumHSA;
    }

    public int getSecondPercentOfNumHSA() {
        return secondPercentOfNumHSA;
    }

    public int getRateOfReturnHSA() {
        return rateOfReturnHSA;
    }

    public int getCurrentBalanceHSA2() {
        return currentBalanceHSA2;
    }

    public int getBalanceMonthHSA2() {
        return balanceMonthHSA2;
    }

    public int getBalanceDayHSA2() {
        return balanceDayHSA2;
    }

    public int getBalanceYearHSA2() {
        return balanceYearHSA2;
    }

    public String getContributionTypeHSA2() {
        return contributionTypeHSA2;
    }

    public int getContributionBalanceHSA2() {
        return contributionBalanceHSA2;
    }

    public int getContributionPercentHSA2() {
        return contributionPercentHSA2;
    }

    public int getFirstPercentMatchNumHSA2() {
        return firstPercentMatchNumHSA2;
    }

    public int getFirstPercentOfNumHSA2() {
        return firstPercentOfNumHSA2;
    }

    public int getSecondPercentMatchNumHSA2() {
        return secondPercentMatchNumHSA2;
    }

    public int getSecondPercentOfNumHSA2() {
        return secondPercentOfNumHSA2;
    }

    public int getRateOfReturnHSA2() {
        return rateOfReturnHSA2;
    }

    public int getCurrentBalance457() {
        return currentBalance457;
    }

    public int getBalanceMonth457() {
        return balanceMonth457;
    }

    public int getBalanceDay457() {
        return balanceDay457;
    }

    public int getBalanceYear457() {
        return balanceYear457;
    }

    public String getContributionType457() {
        return contributionType457;
    }

    public int getContributionBalance457() {
        return contributionBalance457;
    }

    public int getContributionPercent457() {
        return contributionPercent457;
    }

    public int getFirstPercentMatchNum457() {
        return firstPercentMatchNum457;
    }

    public int getFirstPercentOfNum457() {
        return firstPercentOfNum457;
    }

    public int getSecondPercentMatchNum457() {
        return secondPercentMatchNum457;
    }

    public int getSecondPercentOfNum457() {
        return secondPercentOfNum457;
    }

    public int getRateOfReturn457() {
        return rateOfReturn457;
    }

    public int getCurrentBalance4572() {
        return currentBalance4572;
    }

    public int getBalanceMonth4572() {
        return balanceMonth4572;
    }

    public int getBalanceDay4572() {
        return balanceDay4572;
    }

    public int getBalanceYear4572() {
        return balanceYear4572;
    }

    public String getContributionType4572() {
        return contributionType4572;
    }

    public int getContributionBalance4572() {
        return contributionBalance4572;
    }

    public int getContributionPercent4572() {
        return contributionPercent4572;
    }

    public int getFirstPercentMatchNum4572() {
        return firstPercentMatchNum4572;
    }

    public int getFirstPercentOfNum4572() {
        return firstPercentOfNum4572;
    }

    public int getSecondPercentMatchNum4572() {
        return secondPercentMatchNum4572;
    }

    public int getSecondPercentOfNum4572() {
        return secondPercentOfNum4572;
    }

    public int getRateOfReturn4572() {
        return rateOfReturn4572;
    }

    public int getCurrentBalanceFlex() {
        return currentBalanceFlex;
    }

    public int getBalanceMonthFlex() {
        return balanceMonthFlex;
    }

    public int getBalanceDayFlex() {
        return balanceDayFlex;
    }

    public int getBalanceYearFlex() {
        return balanceYearFlex;
    }

    public String getContributionTypeFlex() {
        return contributionTypeFlex;
    }

    public int getContributionBalanceFlex() {
        return contributionBalanceFlex;
    }

    public int getContributionPercentFlex() {
        return contributionPercentFlex;
    }

    public int getFirstPercentMatchNumFlex() {
        return firstPercentMatchNumFlex;
    }

    public int getFirstPercentOfNumFlex() {
        return firstPercentOfNumFlex;
    }

    public int getSecondPercentMatchNumFlex() {
        return secondPercentMatchNumFlex;
    }

    public int getSecondPercentOfNumFlex() {
        return secondPercentOfNumFlex;
    }

    public int getRateOfReturnFlex() {
        return rateOfReturnFlex;
    }

    public int getCurrentBalanceFlex2() {
        return currentBalanceFlex2;
    }

    public int getBalanceMonthFlex2() {
        return balanceMonthFlex2;
    }

    public int getBalanceDayFlex2() {
        return balanceDayFlex2;
    }

    public int getBalanceYearFlex2() {
        return balanceYearFlex2;
    }

    public String getContributionTypeFlex2() {
        return contributionTypeFlex2;
    }

    public int getContributionBalanceFlex2() {
        return contributionBalanceFlex2;
    }

    public int getContributionPercentFlex2() {
        return contributionPercentFlex2;
    }

    public int getFirstPercentMatchNumFlex2() {
        return firstPercentMatchNumFlex2;
    }

    public int getFirstPercentOfNumFlex2() {
        return firstPercentOfNumFlex2;
    }

    public int getSecondPercentMatchNumFlex2() {
        return secondPercentMatchNumFlex2;
    }

    public int getSecondPercentOfNumFlex2() {
        return secondPercentOfNumFlex2;
    }

    public int getRateOfReturnFlex2() {
        return rateOfReturnFlex2;
    }

    public boolean isCurrentlyReceivingSS() {
        return currentlyReceivingSS;
    }

    public boolean isSsAmountIsKnown() {
        return ssAmountIsKnown;
    }

    public int getAreFedTaxesWithheld() {
        return areFedTaxesWithheld;
    }

    public int getAreStateTaxesWithheld() {
        return areStateTaxesWithheld;
    }

    public boolean isBelongsToClient() {
        return belongsToClient;
    }

    public boolean isBelongsToSpouse() {
        return belongsToSpouse;
    }

    public boolean isCurrentlyReceivingSS2() {
        return currentlyReceivingSS2;
    }

    public boolean isSsAmountIsKnown2() {
        return ssAmountIsKnown2;
    }

    public int getAreFedTaxesWithheld2() {
        return areFedTaxesWithheld2;
    }

    public int getAreStateTaxesWithheld2() {
        return areStateTaxesWithheld2;
    }

    public boolean isBelongsToClient2() {
        return belongsToClient2;
    }

    public boolean isBelongsToSpouse2() {
        return belongsToSpouse2;
    }

    public int getRothBalance401K() {
        return rothBalance401K;
    }

    public int getTraditionalBalance401K() {
        return traditionalBalance401K;
    }

    public int getBalanceMonth401K() {
        return balanceMonth401K;
    }

    public int getBalanceDay401K() {
        return balanceDay401K;
    }

    public int getBalanceYear401K() {
        return balanceYear401K;
    }

    public String getContributionType401K() {
        return contributionType401K;
    }

    public int getRothContributionBalance401K() {
        return rothContributionBalance401K;
    }

    public int getTraditionalContributionBalance401K() {
        return traditionalContributionBalance401K;
    }

    public int getRothContributionPercent401K() {
        return rothContributionPercent401K;
    }

    public int getTraditionalContributionPercent401K() {
        return traditionalContributionPercent401K;
    }

    public int getFirstPercentMatchNum401K() {
        return firstPercentMatchNum401K;
    }

    public int getFirstPercentOfNum401K() {
        return firstPercentOfNum401K;
    }

    public int getSecondPercentMatchNum401K() {
        return secondPercentMatchNum401K;
    }

    public int getSecondPercentOfNum401K() {
        return secondPercentOfNum401K;
    }

    public int getRateOfReturn401K() {
        return rateOfReturn401K;
    }

    public int getRothBalance401K2() {
        return rothBalance401K2;
    }

    public int getTraditionalBalance401K2() {
        return traditionalBalance401K2;
    }

    public int getBalanceMonth401K2() {
        return balanceMonth401K2;
    }

    public int getBalanceDay401K2() {
        return balanceDay401K2;
    }

    public int getBalanceYear401K2() {
        return balanceYear401K2;
    }

    public String getContributionType401K2() {
        return contributionType401K2;
    }

    public int getRothContributionBalance401K2() {
        return rothContributionBalance401K2;
    }

    public int getTraditionalContributionBalance401K2() {
        return traditionalContributionBalance401K2;
    }

    public int getRothContributionPercent401K2() {
        return rothContributionPercent401K2;
    }

    public int getTraditionalContributionPercent401K2() {
        return traditionalContributionPercent401K2;
    }

    public int getFirstPercentMatchNum401K2() {
        return firstPercentMatchNum401K2;
    }

    public int getFirstPercentOfNum401K2() {
        return firstPercentOfNum401K2;
    }

    public int getSecondPercentMatchNum401K2() {
        return secondPercentMatchNum401K2;
    }

    public int getSecondPercentOfNum401K2() {
        return secondPercentOfNum401K2;
    }

    public int getRateOfReturn401K2() {
        return rateOfReturn401K2;
    }
    
    public int getSavingsCurrentBalanceText() {
        return savingsCurrentBalanceText;
    }

    public void setSavingsCurrentBalanceText(int savingsCurrentBalanceText) {
        this.savingsCurrentBalanceText = savingsCurrentBalanceText;
    }

    public int getPercentTraditional() {
        return percentTraditional;
    }

    public int getPercentRoth() {
        return percentRoth;
    }

    public boolean isBalanceChosen() {
        return balanceChosen;
    }

    public int getPercentTraditional2() {
        return percentTraditional2;
    }

    public int getPercentRoth2() {
        return percentRoth2;
    }

    public boolean isBalanceChosen2() {
        return balanceChosen2;
    }

    public void setPercentTraditional(int percentTraditional) {
        this.percentTraditional = percentTraditional;
    }

    public void setPercentRoth(int percentRoth) {
        this.percentRoth = percentRoth;
    }

    public void setBalanceChosen(boolean balanceChosen) {
        this.balanceChosen = balanceChosen;
    }

    public void setPercentTraditional2(int percentTraditional2) {
        this.percentTraditional2 = percentTraditional2;
    }

    public void setPercentRoth2(int percentRoth2) {
        this.percentRoth2 = percentRoth2;
    }

    public void setBalanceChosen2(boolean balanceChosen2) {
        this.balanceChosen2 = balanceChosen2;
    }

    public int getPensionMonth() {
        return pensionMonth;
    }

    public int getPensionDay() {
        return pensionDay;
    }

    public int getPensionYear() {
        return pensionYear;
    }

    public int getPensionMonth2() {
        return pensionMonth2;
    }

    public int getPensionDay2() {
        return pensionDay2;
    }

    public int getPensionYear2() {
        return pensionYear2;
    }

    public void setPensionMonth(int pensionMonth) {
        this.pensionMonth = pensionMonth;
    }

    public void setPensionDay(int pensionDay) {
        this.pensionDay = pensionDay;
    }

    public void setPensionYear(int pensionYear) {
        this.pensionYear = pensionYear;
    }

    public void setPensionMonth2(int pensionMonth2) {
        this.pensionMonth2 = pensionMonth2;
    }

    public void setPensionDay2(int pensionDay2) {
        this.pensionDay2 = pensionDay2;
    }

    public void setPensionYear2(int pensionYear2) {
        this.pensionYear2 = pensionYear2;
    }

    public int getMonthIra3() {
        return monthIra3;
    }

    public int getDayIra3() {
        return dayIra3;
    }

    public int getYearIra3() {
        return yearIra3;
    }

    public int getContributionRothIra3() {
        return contributionRothIra3;
    }

    public int getContributionTraditionalIra3() {
        return contributionTraditionalIra3;
    }

    public int getRothBalance3() {
        return rothBalance3;
    }

    public int getTraditionalBalance3() {
        return traditionalBalance3;
    }

    public int getPercentTraditional3() {
        return percentTraditional3;
    }

    public int getPercentRoth3() {
        return percentRoth3;
    }

    public boolean isBalanceChosen3() {
        return balanceChosen3;
    }

    public String getBelongsToIra3() {
        return belongsToIra3;
    }

    public int getAwardDay3() {
        return awardDay3;
    }

    public int getAwardMonth3() {
        return awardMonth3;
    }

    public int getAwardYear3() {
        return awardYear3;
    }

    public int getCurrentAmount3() {
        return currentAmount3;
    }

    public int getCurrentValue3() {
        return currentValue3;
    }

    public int getExpirationDay3() {
        return expirationDay3;
    }

    public int getExpirationMonth3() {
        return expirationMonth3;
    }

    public int getExpirationYear3() {
        return expirationYear3;
    }

    public int getRateOfReturn3() {
        return rateOfReturn3;
    }

    public boolean isClientRecievesLumpSumBool3() {
        return clientRecievesLumpSumBool3;
    }

    public boolean isClientRecievesMonthlyBool3() {
        return clientRecievesMonthlyBool3;
    }

    public int getCostOfLivingAdjustment3() {
        return costOfLivingAdjustment3;
    }

    public int getAmountPension3() {
        return amountPension3;
    }

    public int getPensionMonth3() {
        return pensionMonth3;
    }

    public int getPensionDay3() {
        return pensionDay3;
    }

    public int getPensionYear3() {
        return pensionYear3;
    }

    public int getCurrentBalance403B3() {
        return currentBalance403B3;
    }

    public int getBalanceMonth403B3() {
        return balanceMonth403B3;
    }

    public int getBalanceDay403B3() {
        return balanceDay403B3;
    }

    public int getBalanceYear403B3() {
        return balanceYear403B3;
    }

    public String getContributionType403B3() {
        return contributionType403B3;
    }

    public int getContributionBalance403B3() {
        return contributionBalance403B3;
    }

    public int getContributionPercent403B3() {
        return contributionPercent403B3;
    }

    public int getFirstPercentMatchNum403B3() {
        return firstPercentMatchNum403B3;
    }

    public int getFirstPercentOfNum403B3() {
        return firstPercentOfNum403B3;
    }

    public int getSecondPercentMatchNum403B3() {
        return secondPercentMatchNum403B3;
    }

    public int getSecondPercentOfNum403B3() {
        return secondPercentOfNum403B3;
    }

    public int getRateOfReturn403B3() {
        return rateOfReturn403B3;
    }

    public int getCurrentBalanceHSA3() {
        return currentBalanceHSA3;
    }

    public int getBalanceMonthHSA3() {
        return balanceMonthHSA3;
    }

    public int getBalanceDayHSA3() {
        return balanceDayHSA3;
    }

    public int getBalanceYearHSA3() {
        return balanceYearHSA3;
    }

    public String getContributionTypeHSA3() {
        return contributionTypeHSA3;
    }

    public int getContributionBalanceHSA3() {
        return contributionBalanceHSA3;
    }

    public int getContributionPercentHSA3() {
        return contributionPercentHSA3;
    }

    public int getFirstPercentMatchNumHSA3() {
        return firstPercentMatchNumHSA3;
    }

    public int getFirstPercentOfNumHSA3() {
        return firstPercentOfNumHSA3;
    }

    public int getSecondPercentMatchNumHSA3() {
        return secondPercentMatchNumHSA3;
    }

    public int getSecondPercentOfNumHSA3() {
        return secondPercentOfNumHSA3;
    }

    public int getRateOfReturnHSA3() {
        return rateOfReturnHSA3;
    }

    public int getCurrentBalance4573() {
        return currentBalance4573;
    }

    public int getBalanceMonth4573() {
        return balanceMonth4573;
    }

    public int getBalanceDay4573() {
        return balanceDay4573;
    }

    public int getBalanceYear4573() {
        return balanceYear4573;
    }

    public String getContributionType4573() {
        return contributionType4573;
    }

    public int getContributionBalance4573() {
        return contributionBalance4573;
    }

    public int getContributionPercent4573() {
        return contributionPercent4573;
    }

    public int getFirstPercentMatchNum4573() {
        return firstPercentMatchNum4573;
    }

    public int getFirstPercentOfNum4573() {
        return firstPercentOfNum4573;
    }

    public int getSecondPercentMatchNum4573() {
        return secondPercentMatchNum4573;
    }

    public int getSecondPercentOfNum4573() {
        return secondPercentOfNum4573;
    }

    public int getRateOfReturn4573() {
        return rateOfReturn4573;
    }

    public int getCurrentBalanceFlex3() {
        return currentBalanceFlex3;
    }

    public int getBalanceMonthFlex3() {
        return balanceMonthFlex3;
    }

    public int getBalanceDayFlex3() {
        return balanceDayFlex3;
    }

    public int getBalanceYearFlex3() {
        return balanceYearFlex3;
    }

    public String getContributionTypeFlex3() {
        return contributionTypeFlex3;
    }

    public int getContributionBalanceFlex3() {
        return contributionBalanceFlex3;
    }

    public int getContributionPercentFlex3() {
        return contributionPercentFlex3;
    }

    public int getFirstPercentMatchNumFlex3() {
        return firstPercentMatchNumFlex3;
    }

    public int getFirstPercentOfNumFlex3() {
        return firstPercentOfNumFlex3;
    }

    public int getSecondPercentMatchNumFlex3() {
        return secondPercentMatchNumFlex3;
    }

    public int getSecondPercentOfNumFlex3() {
        return secondPercentOfNumFlex3;
    }

    public int getRateOfReturnFlex3() {
        return rateOfReturnFlex3;
    }

    public boolean isCurrentlyReceivingSS3() {
        return currentlyReceivingSS3;
    }

    public boolean isSsAmountIsKnown3() {
        return ssAmountIsKnown3;
    }

    public int getAreFedTaxesWithheld3() {
        return areFedTaxesWithheld3;
    }

    public int getAreStateTaxesWithheld3() {
        return areStateTaxesWithheld3;
    }

    public boolean isBelongsToClient3() {
        return belongsToClient3;
    }

    public boolean isBelongsToSpouse3() {
        return belongsToSpouse3;
    }

    public int getStatePercentWithheldValue3() {
        return statePercentWithheldValue3;
    }

    public int getAgeRecievingBenefits3() {
        return ageRecievingBenefits3;
    }

    public int getExpectedMonthlyAmountValue3() {
        return expectedMonthlyAmountValue3;
    }

    public int getFederalPercentWithheldValue3() {
        return federalPercentWithheldValue3;
    }

    public int getSsAmountValue3() {
        return ssAmountValue3;
    }

    public int getRothBalance401K3() {
        return rothBalance401K3;
    }

    public int getTraditionalBalance401K3() {
        return traditionalBalance401K3;
    }

    public int getBalanceMonth401K3() {
        return balanceMonth401K3;
    }

    public int getBalanceDay401K3() {
        return balanceDay401K3;
    }

    public int getBalanceYear401K3() {
        return balanceYear401K3;
    }

    public String getContributionType401K3() {
        return contributionType401K3;
    }

    public int getRothContributionBalance401K3() {
        return rothContributionBalance401K3;
    }

    public int getTraditionalContributionBalance401K3() {
        return traditionalContributionBalance401K3;
    }

    public int getRothContributionPercent401K3() {
        return rothContributionPercent401K3;
    }

    public int getTraditionalContributionPercent401K3() {
        return traditionalContributionPercent401K3;
    }

    public int getFirstPercentMatchNum401K3() {
        return firstPercentMatchNum401K3;
    }

    public int getFirstPercentOfNum401K3() {
        return firstPercentOfNum401K3;
    }

    public int getSecondPercentMatchNum401K3() {
        return secondPercentMatchNum401K3;
    }

    public int getSecondPercentOfNum401K3() {
        return secondPercentOfNum401K3;
    }

    public int getRateOfReturn401K3() {
        return rateOfReturn401K3;
    }

    public String getPercentOrBalance3() {
        return percentOrBalance3;
    }

    public void setMonthIra3(int monthIra3) {
        this.monthIra3 = monthIra3;
    }

    public void setDayIra3(int dayIra3) {
        this.dayIra3 = dayIra3;
    }

    public void setYearIra3(int yearIra3) {
        this.yearIra3 = yearIra3;
    }

    public void setContributionRothIra3(int contributionRothIra3) {
        this.contributionRothIra3 = contributionRothIra3;
    }

    public void setContributionTraditionalIra3(int contributionTraditionalIra3) {
        this.contributionTraditionalIra3 = contributionTraditionalIra3;
    }

    public void setRothBalance3(int rothBalance3) {
        this.rothBalance3 = rothBalance3;
    }

    public void setTraditionalBalance3(int traditionalBalance3) {
        this.traditionalBalance3 = traditionalBalance3;
    }

    public void setPercentTraditional3(int percentTraditional3) {
        this.percentTraditional3 = percentTraditional3;
    }

    public void setPercentRoth3(int percentRoth3) {
        this.percentRoth3 = percentRoth3;
    }

    public void setBalanceChosen3(boolean balanceChosen3) {
        this.balanceChosen3 = balanceChosen3;
    }

    public void setBelongsToIra3(String belongsToIra3) {
        this.belongsToIra3 = belongsToIra3;
    }

    public void setAwardDay3(int awardDay3) {
        this.awardDay3 = awardDay3;
    }

    public void setAwardMonth3(int awardMonth3) {
        this.awardMonth3 = awardMonth3;
    }

    public void setAwardYear3(int awardYear3) {
        this.awardYear3 = awardYear3;
    }

    public void setCurrentAmount3(int currentAmount3) {
        this.currentAmount3 = currentAmount3;
    }

    public void setCurrentValue3(int currentValue3) {
        this.currentValue3 = currentValue3;
    }

    public void setExpirationDay3(int expirationDay3) {
        this.expirationDay3 = expirationDay3;
    }

    public void setExpirationMonth3(int expirationMonth3) {
        this.expirationMonth3 = expirationMonth3;
    }

    public void setExpirationYear3(int expirationYear3) {
        this.expirationYear3 = expirationYear3;
    }

    public void setRateOfReturn3(int rateOfReturn3) {
        this.rateOfReturn3 = rateOfReturn3;
    }

    public void setClientRecievesLumpSumBool3(boolean clientRecievesLumpSumBool3) {
        this.clientRecievesLumpSumBool3 = clientRecievesLumpSumBool3;
    }

    public void setClientRecievesMonthlyBool3(boolean clientRecievesMonthlyBool3) {
        this.clientRecievesMonthlyBool3 = clientRecievesMonthlyBool3;
    }

    public void setCostOfLivingAdjustment3(int costOfLivingAdjustment3) {
        this.costOfLivingAdjustment3 = costOfLivingAdjustment3;
    }

    public void setAmountPension3(int amountPension3) {
        this.amountPension3 = amountPension3;
    }

    public void setPensionMonth3(int pensionMonth3) {
        this.pensionMonth3 = pensionMonth3;
    }

    public void setPensionDay3(int pensionDay3) {
        this.pensionDay3 = pensionDay3;
    }

    public void setPensionYear3(int pensionYear3) {
        this.pensionYear3 = pensionYear3;
    }

    public void setCurrentBalance403B3(int currentBalance403B3) {
        this.currentBalance403B3 = currentBalance403B3;
    }

    public void setBalanceMonth403B3(int balanceMonth403B3) {
        this.balanceMonth403B3 = balanceMonth403B3;
    }

    public void setBalanceDay403B3(int balanceDay403B3) {
        this.balanceDay403B3 = balanceDay403B3;
    }

    public void setBalanceYear403B3(int balanceYear403B3) {
        this.balanceYear403B3 = balanceYear403B3;
    }

    public void setContributionType403B3(String contributionType403B3) {
        this.contributionType403B3 = contributionType403B3;
    }

    public void setContributionBalance403B3(int contributionBalance403B3) {
        this.contributionBalance403B3 = contributionBalance403B3;
    }

    public void setContributionPercent403B3(int contributionPercent403B3) {
        this.contributionPercent403B3 = contributionPercent403B3;
    }

    public void setFirstPercentMatchNum403B3(int firstPercentMatchNum403B3) {
        this.firstPercentMatchNum403B3 = firstPercentMatchNum403B3;
    }

    public void setFirstPercentOfNum403B3(int firstPercentOfNum403B3) {
        this.firstPercentOfNum403B3 = firstPercentOfNum403B3;
    }

    public void setSecondPercentMatchNum403B3(int secondPercentMatchNum403B3) {
        this.secondPercentMatchNum403B3 = secondPercentMatchNum403B3;
    }

    public void setSecondPercentOfNum403B3(int secondPercentOfNum403B3) {
        this.secondPercentOfNum403B3 = secondPercentOfNum403B3;
    }

    public void setRateOfReturn403B3(int rateOfReturn403B3) {
        this.rateOfReturn403B3 = rateOfReturn403B3;
    }

    public void setCurrentBalanceHSA3(int currentBalanceHSA3) {
        this.currentBalanceHSA3 = currentBalanceHSA3;
    }

    public void setBalanceMonthHSA3(int balanceMonthHSA3) {
        this.balanceMonthHSA3 = balanceMonthHSA3;
    }

    public void setBalanceDayHSA3(int balanceDayHSA3) {
        this.balanceDayHSA3 = balanceDayHSA3;
    }

    public void setBalanceYearHSA3(int balanceYearHSA3) {
        this.balanceYearHSA3 = balanceYearHSA3;
    }

    public void setContributionTypeHSA3(String contributionTypeHSA3) {
        this.contributionTypeHSA3 = contributionTypeHSA3;
    }

    public void setContributionBalanceHSA3(int contributionBalanceHSA3) {
        this.contributionBalanceHSA3 = contributionBalanceHSA3;
    }

    public void setContributionPercentHSA3(int contributionPercentHSA3) {
        this.contributionPercentHSA3 = contributionPercentHSA3;
    }

    public void setFirstPercentMatchNumHSA3(int firstPercentMatchNumHSA3) {
        this.firstPercentMatchNumHSA3 = firstPercentMatchNumHSA3;
    }

    public void setFirstPercentOfNumHSA3(int firstPercentOfNumHSA3) {
        this.firstPercentOfNumHSA3 = firstPercentOfNumHSA3;
    }

    public void setSecondPercentMatchNumHSA3(int secondPercentMatchNumHSA3) {
        this.secondPercentMatchNumHSA3 = secondPercentMatchNumHSA3;
    }

    public void setSecondPercentOfNumHSA3(int secondPercentOfNumHSA3) {
        this.secondPercentOfNumHSA3 = secondPercentOfNumHSA3;
    }

    public void setRateOfReturnHSA3(int rateOfReturnHSA3) {
        this.rateOfReturnHSA3 = rateOfReturnHSA3;
    }

    public void setCurrentBalance4573(int currentBalance4573) {
        this.currentBalance4573 = currentBalance4573;
    }

    public void setBalanceMonth4573(int balanceMonth4573) {
        this.balanceMonth4573 = balanceMonth4573;
    }

    public void setBalanceDay4573(int balanceDay4573) {
        this.balanceDay4573 = balanceDay4573;
    }

    public void setBalanceYear4573(int balanceYear4573) {
        this.balanceYear4573 = balanceYear4573;
    }

    public void setContributionType4573(String contributionType4573) {
        this.contributionType4573 = contributionType4573;
    }

    public void setContributionBalance4573(int contributionBalance4573) {
        this.contributionBalance4573 = contributionBalance4573;
    }

    public void setContributionPercent4573(int contributionPercent4573) {
        this.contributionPercent4573 = contributionPercent4573;
    }

    public void setFirstPercentMatchNum4573(int firstPercentMatchNum4573) {
        this.firstPercentMatchNum4573 = firstPercentMatchNum4573;
    }

    public void setFirstPercentOfNum4573(int firstPercentOfNum4573) {
        this.firstPercentOfNum4573 = firstPercentOfNum4573;
    }

    public void setSecondPercentMatchNum4573(int secondPercentMatchNum4573) {
        this.secondPercentMatchNum4573 = secondPercentMatchNum4573;
    }

    public void setSecondPercentOfNum4573(int secondPercentOfNum4573) {
        this.secondPercentOfNum4573 = secondPercentOfNum4573;
    }

    public void setRateOfReturn4573(int rateOfReturn4573) {
        this.rateOfReturn4573 = rateOfReturn4573;
    }

    public void setCurrentBalanceFlex3(int currentBalanceFlex3) {
        this.currentBalanceFlex3 = currentBalanceFlex3;
    }

    public void setBalanceMonthFlex3(int balanceMonthFlex3) {
        this.balanceMonthFlex3 = balanceMonthFlex3;
    }

    public void setBalanceDayFlex3(int balanceDayFlex3) {
        this.balanceDayFlex3 = balanceDayFlex3;
    }

    public void setBalanceYearFlex3(int balanceYearFlex3) {
        this.balanceYearFlex3 = balanceYearFlex3;
    }

    public void setContributionTypeFlex3(String contributionTypeFlex3) {
        this.contributionTypeFlex3 = contributionTypeFlex3;
    }

    public void setContributionBalanceFlex3(int contributionBalanceFlex3) {
        this.contributionBalanceFlex3 = contributionBalanceFlex3;
    }

    public void setContributionPercentFlex3(int contributionPercentFlex3) {
        this.contributionPercentFlex3 = contributionPercentFlex3;
    }

    public void setFirstPercentMatchNumFlex3(int firstPercentMatchNumFlex3) {
        this.firstPercentMatchNumFlex3 = firstPercentMatchNumFlex3;
    }

    public void setFirstPercentOfNumFlex3(int firstPercentOfNumFlex3) {
        this.firstPercentOfNumFlex3 = firstPercentOfNumFlex3;
    }

    public void setSecondPercentMatchNumFlex3(int secondPercentMatchNumFlex3) {
        this.secondPercentMatchNumFlex3 = secondPercentMatchNumFlex3;
    }

    public void setSecondPercentOfNumFlex3(int secondPercentOfNumFlex3) {
        this.secondPercentOfNumFlex3 = secondPercentOfNumFlex3;
    }

    public void setRateOfReturnFlex3(int rateOfReturnFlex3) {
        this.rateOfReturnFlex3 = rateOfReturnFlex3;
    }

    public void setCurrentlyReceivingSS3(boolean currentlyReceivingSS3) {
        this.currentlyReceivingSS3 = currentlyReceivingSS3;
    }

    public void setSsAmountIsKnown3(boolean ssAmountIsKnown3) {
        this.ssAmountIsKnown3 = ssAmountIsKnown3;
    }

    public void setAreFedTaxesWithheld3(int areFedTaxesWithheld3) {
        this.areFedTaxesWithheld3 = areFedTaxesWithheld3;
    }

    public void setAreStateTaxesWithheld3(int areStateTaxesWithheld3) {
        this.areStateTaxesWithheld3 = areStateTaxesWithheld3;
    }

    public void setBelongsToClient3(boolean belongsToClient3) {
        this.belongsToClient3 = belongsToClient3;
    }

    public void setBelongsToSpouse3(boolean belongsToSpouse3) {
        this.belongsToSpouse3 = belongsToSpouse3;
    }

    public void setStatePercentWithheldValue3(int statePercentWithheldValue3) {
        this.statePercentWithheldValue3 = statePercentWithheldValue3;
    }

    public void setAgeRecievingBenefits3(int ageRecievingBenefits3) {
        this.ageRecievingBenefits3 = ageRecievingBenefits3;
    }

    public void setExpectedMonthlyAmountValue3(int expectedMonthlyAmountValue3) {
        this.expectedMonthlyAmountValue3 = expectedMonthlyAmountValue3;
    }

    public void setFederalPercentWithheldValue3(int federalPercentWithheldValue3) {
        this.federalPercentWithheldValue3 = federalPercentWithheldValue3;
    }

    public void setSsAmountValue3(int ssAmountValue3) {
        this.ssAmountValue3 = ssAmountValue3;
    }

    public void setRothBalance401K3(int rothBalance401K3) {
        this.rothBalance401K3 = rothBalance401K3;
    }

    public void setTraditionalBalance401K3(int traditionalBalance401K3) {
        this.traditionalBalance401K3 = traditionalBalance401K3;
    }

    public void setBalanceMonth401K3(int balanceMonth401K3) {
        this.balanceMonth401K3 = balanceMonth401K3;
    }

    public void setBalanceDay401K3(int balanceDay401K3) {
        this.balanceDay401K3 = balanceDay401K3;
    }

    public void setBalanceYear401K3(int balanceYear401K3) {
        this.balanceYear401K3 = balanceYear401K3;
    }

    public void setContributionType401K3(String contributionType401K3) {
        this.contributionType401K3 = contributionType401K3;
    }

    public void setRothContributionBalance401K3(int rothContributionBalance401K3) {
        this.rothContributionBalance401K3 = rothContributionBalance401K3;
    }

    public void setTraditionalContributionBalance401K3(int traditionalContributionBalance401K3) {
        this.traditionalContributionBalance401K3 = traditionalContributionBalance401K3;
    }

    public void setRothContributionPercent401K3(int rothContributionPercent401K3) {
        this.rothContributionPercent401K3 = rothContributionPercent401K3;
    }

    public void setTraditionalContributionPercent401K3(int traditionalContributionPercent401K3) {
        this.traditionalContributionPercent401K3 = traditionalContributionPercent401K3;
    }

    public void setFirstPercentMatchNum401K3(int firstPercentMatchNum401K3) {
        this.firstPercentMatchNum401K3 = firstPercentMatchNum401K3;
    }

    public void setFirstPercentOfNum401K3(int firstPercentOfNum401K3) {
        this.firstPercentOfNum401K3 = firstPercentOfNum401K3;
    }

    public void setSecondPercentMatchNum401K3(int secondPercentMatchNum401K3) {
        this.secondPercentMatchNum401K3 = secondPercentMatchNum401K3;
    }

    public void setSecondPercentOfNum401K3(int secondPercentOfNum401K3) {
        this.secondPercentOfNum401K3 = secondPercentOfNum401K3;
    }

    public void setRateOfReturn401K3(int rateOfReturn401K3) {
        this.rateOfReturn401K3 = rateOfReturn401K3;
    }

    public void setPercentOrBalance3(String percentOrBalance3) {
        this.percentOrBalance3 = percentOrBalance3;
    }

    public int getAssumedIncomeText2() {
        return assumedIncomeText2;
    }

    public int getBalancedFundsCostBasisText2() {
        return balancedFundsCostBasisText2;
    }

    public int getBalancedFundsCurrentBalanceText2() {
        return balancedFundsCurrentBalanceText2;
    }

    public int getBalancedFundsDayText2() {
        return balancedFundsDayText2;
    }

    public int getBalancedFundsMonthText2() {
        return balancedFundsMonthText2;
    }

    public int getBalancedFundsYearText2() {
        return balancedFundsYearText2;
    }

    public int getBondsCostBasisText2() {
        return bondsCostBasisText2;
    }

    public int getBondsCurrentBalanceText2() {
        return bondsCurrentBalanceText2;
    }

    public int getBondsDayText2() {
        return bondsDayText2;
    }

    public int getBondsMonthText2() {
        return bondsMonthText2;
    }

    public int getBondsYearText2() {
        return bondsYearText2;
    }

    public int getCheckingBalanceCostBasisText2() {
        return checkingBalanceCostBasisText2;
    }

    public int getCheckingCurrentBalanceText2() {
        return checkingCurrentBalanceText2;
    }

    public int getCheckingDayText2() {
        return checkingDayText2;
    }

    public int getCheckingMonthText2() {
        return checkingMonthText2;
    }

    public int getCheckingYearText2() {
        return checkingYearText2;
    }

    public int getmBondsCurrentBalanceText2() {
        return mBondsCurrentBalanceText2;
    }

    public int getmBondsMonthText2() {
        return mBondsMonthText2;
    }

    public int getmBondsDayText2() {
        return mBondsDayText2;
    }

    public int getmBondsYearText2() {
        return mBondsYearText2;
    }

    public int getmBondsCostBasis2() {
        return mBondsCostBasis2;
    }

    public int getRateOfReturnText2() {
        return rateOfReturnText2;
    }

    public int getSavingsCostBasisText2() {
        return savingsCostBasisText2;
    }

    public int getSavingsDayText2() {
        return savingsDayText2;
    }

    public int getSavingsMonthText2() {
        return savingsMonthText2;
    }

    public int getSavingsYearText2() {
        return savingsYearText2;
    }

    public int getStocksCostBasisText2() {
        return stocksCostBasisText2;
    }

    public int getStocksCurrentBalanceText2() {
        return stocksCurrentBalanceText2;
    }

    public int getStocksDayText2() {
        return stocksDayText2;
    }

    public int getStocksMonthText2() {
        return stocksMonthText2;
    }

    public int getStocksYearText2() {
        return stocksYearText2;
    }

    public int getSavingsCurrentBalanceText2() {
        return savingsCurrentBalanceText2;
    }

    public void setAssumedIncomeText2(int assumedIncomeText2) {
        this.assumedIncomeText2 = assumedIncomeText2;
    }

    public void setBalancedFundsCostBasisText2(int balancedFundsCostBasisText2) {
        this.balancedFundsCostBasisText2 = balancedFundsCostBasisText2;
    }

    public void setBalancedFundsCurrentBalanceText2(int balancedFundsCurrentBalanceText2) {
        this.balancedFundsCurrentBalanceText2 = balancedFundsCurrentBalanceText2;
    }

    public void setBalancedFundsDayText2(int balancedFundsDayText2) {
        this.balancedFundsDayText2 = balancedFundsDayText2;
    }

    public void setBalancedFundsMonthText2(int balancedFundsMonthText2) {
        this.balancedFundsMonthText2 = balancedFundsMonthText2;
    }

    public void setBalancedFundsYearText2(int balancedFundsYearText2) {
        this.balancedFundsYearText2 = balancedFundsYearText2;
    }

    public void setBondsCostBasisText2(int bondsCostBasisText2) {
        this.bondsCostBasisText2 = bondsCostBasisText2;
    }

    public void setBondsCurrentBalanceText2(int bondsCurrentBalanceText2) {
        this.bondsCurrentBalanceText2 = bondsCurrentBalanceText2;
    }

    public void setBondsDayText2(int bondsDayText2) {
        this.bondsDayText2 = bondsDayText2;
    }

    public void setBondsMonthText2(int bondsMonthText2) {
        this.bondsMonthText2 = bondsMonthText2;
    }

    public void setBondsYearText2(int bondsYearText2) {
        this.bondsYearText2 = bondsYearText2;
    }

    public void setCheckingBalanceCostBasisText2(int checkingBalanceCostBasisText2) {
        this.checkingBalanceCostBasisText2 = checkingBalanceCostBasisText2;
    }

    public void setCheckingCurrentBalanceText2(int checkingCurrentBalanceText2) {
        this.checkingCurrentBalanceText2 = checkingCurrentBalanceText2;
    }

    public void setCheckingDayText2(int checkingDayText2) {
        this.checkingDayText2 = checkingDayText2;
    }

    public void setCheckingMonthText2(int checkingMonthText2) {
        this.checkingMonthText2 = checkingMonthText2;
    }

    public void setCheckingYearText2(int checkingYearText2) {
        this.checkingYearText2 = checkingYearText2;
    }

    public void setmBondsCurrentBalanceText2(int mBondsCurrentBalanceText2) {
        this.mBondsCurrentBalanceText2 = mBondsCurrentBalanceText2;
    }

    public void setmBondsMonthText2(int mBondsMonthText2) {
        this.mBondsMonthText2 = mBondsMonthText2;
    }

    public void setmBondsDayText2(int mBondsDayText2) {
        this.mBondsDayText2 = mBondsDayText2;
    }

    public void setmBondsYearText2(int mBondsYearText2) {
        this.mBondsYearText2 = mBondsYearText2;
    }

    public void setmBondsCostBasis2(int mBondsCostBasis2) {
        this.mBondsCostBasis2 = mBondsCostBasis2;
    }

    public void setRateOfReturnText2(int rateOfReturnText2) {
        this.rateOfReturnText2 = rateOfReturnText2;
    }

    public void setSavingsCostBasisText2(int savingsCostBasisText2) {
        this.savingsCostBasisText2 = savingsCostBasisText2;
    }

    public void setSavingsDayText2(int savingsDayText2) {
        this.savingsDayText2 = savingsDayText2;
    }

    public void setSavingsMonthText2(int savingsMonthText2) {
        this.savingsMonthText2 = savingsMonthText2;
    }

    public void setSavingsYearText2(int savingsYearText2) {
        this.savingsYearText2 = savingsYearText2;
    }

    public void setStocksCostBasisText2(int stocksCostBasisText2) {
        this.stocksCostBasisText2 = stocksCostBasisText2;
    }

    public void setStocksCurrentBalanceText2(int stocksCurrentBalanceText2) {
        this.stocksCurrentBalanceText2 = stocksCurrentBalanceText2;
    }

    public void setStocksDayText2(int stocksDayText2) {
        this.stocksDayText2 = stocksDayText2;
    }

    public void setStocksMonthText2(int stocksMonthText2) {
        this.stocksMonthText2 = stocksMonthText2;
    }

    public void setStocksYearText2(int stocksYearText2) {
        this.stocksYearText2 = stocksYearText2;
    }

    public void setSavingsCurrentBalanceText2(int savingsCurrentBalanceText2) {
        this.savingsCurrentBalanceText2 = savingsCurrentBalanceText2;
    }

    public boolean isAnnuitiesFilled() {
        return annuitiesFilled;
    }

    public boolean isAnnuitiesFilled2() {
        return annuitiesFilled2;
    }

    public boolean isIraFilled() {
        return iraFilled;
    }

    public boolean isIraFilled2() {
        return iraFilled2;
    }

    public boolean isIraFilled3() {
        return iraFilled3;
    }

    public boolean isOptionsGrantsFilled() {
        return optionsGrantsFilled;
    }

    public boolean isOptionsGrantsFilled2() {
        return optionsGrantsFilled2;
    }

    public boolean isOptionsGrantsFilled3() {
        return optionsGrantsFilled3;
    }

    public boolean isPensionFilled() {
        return pensionFilled;
    }

    public boolean isPensionFilled2() {
        return pensionFilled2;
    }

    public boolean isPensionFilled3() {
        return pensionFilled3;
    }

    public boolean isFilled403B() {
        return filled403B;
    }

    public boolean isFilled403B2() {
        return filled403B2;
    }

    public boolean isFilled403B3() {
        return filled403B3;
    }

    public boolean isHsaFilled() {
        return hsaFilled;
    }

    public boolean isHsaFilled2() {
        return hsaFilled2;
    }

    public boolean isHsaFilled3() {
        return hsaFilled3;
    }

    public boolean isFilled457() {
        return filled457;
    }

    public boolean isFilled4572() {
        return filled4572;
    }

    public boolean isFilled4573() {
        return filled4573;
    }

    public boolean isFlexSpendFilled() {
        return flexSpendFilled;
    }

    public boolean isFlexSpendFilled2() {
        return flexSpendFilled2;
    }

    public boolean isFlexSpendFilled3() {
        return flexSpendFilled3;
    }

    public boolean isFilledSS() {
        return filledSS;
    }

    public boolean isFilledSS2() {
        return filledSS2;
    }

    public boolean isFilledSS3() {
        return filledSS3;
    }

    public boolean isFilled401K() {
        return filled401K;
    }

    public boolean isFilled401K2() {
        return filled401K2;
    }

    public boolean isFilled401K3() {
        return filled401K3;
    }

    public void setAnnuitiesFilled(boolean annuitiesFilled) {
        this.annuitiesFilled = annuitiesFilled;
    }

    public void setAnnuitiesFilled2(boolean annuitiesFilled2) {
        this.annuitiesFilled2 = annuitiesFilled2;
    }

    public void setIraFilled(boolean iraFilled) {
        this.iraFilled = iraFilled;
    }

    public void setIraFilled2(boolean iraFilled2) {
        this.iraFilled2 = iraFilled2;
    }

    public void setIraFilled3(boolean iraFilled3) {
        this.iraFilled3 = iraFilled3;
    }

    public void setOptionsGrantsFilled(boolean optionsGrantsFilled) {
        this.optionsGrantsFilled = optionsGrantsFilled;
    }

    public void setOptionsGrantsFilled2(boolean optionsGrantsFilled2) {
        this.optionsGrantsFilled2 = optionsGrantsFilled2;
    }

    public void setOptionsGrantsFilled3(boolean optionsGrantsFilled3) {
        this.optionsGrantsFilled3 = optionsGrantsFilled3;
    }

    public void setPensionFilled(boolean pensionFilled) {
        this.pensionFilled = pensionFilled;
    }

    public void setPensionFilled2(boolean pensionFilled2) {
        this.pensionFilled2 = pensionFilled2;
    }

    public void setPensionFilled3(boolean pensionFilled3) {
        this.pensionFilled3 = pensionFilled3;
    }

    public void setFilled403B(boolean filled403B) {
        this.filled403B = filled403B;
    }

    public void setFilled403B2(boolean filled403B2) {
        this.filled403B2 = filled403B2;
    }

    public void setFilled403B3(boolean filled403B3) {
        this.filled403B3 = filled403B3;
    }

    public void setHsaFilled(boolean hsaFilled) {
        this.hsaFilled = hsaFilled;
    }

    public void setHsaFilled2(boolean hsaFilled2) {
        this.hsaFilled2 = hsaFilled2;
    }

    public void setHsaFilled3(boolean hsaFilled3) {
        this.hsaFilled3 = hsaFilled3;
    }

    public void setFilled457(boolean filled457) {
        this.filled457 = filled457;
    }

    public void setFilled4572(boolean filled4572) {
        this.filled4572 = filled4572;
    }

    public void setFilled4573(boolean filled4573) {
        this.filled4573 = filled4573;
    }

    public void setFlexSpendFilled(boolean flexSpendFilled) {
        this.flexSpendFilled = flexSpendFilled;
    }

    public void setFlexSpendFilled2(boolean flexSpendFilled2) {
        this.flexSpendFilled2 = flexSpendFilled2;
    }

    public void setFlexSpendFilled3(boolean flexSpendFilled3) {
        this.flexSpendFilled3 = flexSpendFilled3;
    }

    public void setFilledSS(boolean filledSS) {
        this.filledSS = filledSS;
    }

    public void setFilledSS2(boolean filledSS2) {
        this.filledSS2 = filledSS2;
    }

    public void setFilledSS3(boolean filledSS3) {
        this.filledSS3 = filledSS3;
    }

    public void setFilled401K(boolean filled401K) {
        this.filled401K = filled401K;
    }

    public void setFilled401K2(boolean filled401K2) {
        this.filled401K2 = filled401K2;
    }

    public void setFilled401K3(boolean filled401K3) {
        this.filled401K3 = filled401K3;
    }
    
    
    
    
    
}
