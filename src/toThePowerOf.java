import java.math.BigInteger;
public class toThePowerOf {
    public static BigInteger toThePowerOfTwenty(int num){
        BigInteger val = BigInteger.ZERO;
        for(int a = 0; a<num; a++){
            for(int b = 0; b<num; b++){
                for(int c = 0; c<num; c++){
                    for(int d = 0; d<num; d++){
                        for(int e = 0; e<num; e++){
                            for(int f = 0; f<num; f++){
                                for(int g = 0; g<num; g++){
                                    for(int h = 0; h<num; h++){
                                        for(int i = 0; i<num; i++){
                                            for(int j = 0; j<num; j++){
                                                for(int k = 0; k<num; k++){
                                                    for(int l = 0; l<num; l++){
                                                        for(int m = 0; m<num; m++){
                                                            for(int n = 0; n<num; n++){
                                                                for(int o = 0; o<num; o++){
                                                                    for(int p = 0; p<num; p++){
                                                                        for(int q = 0; q<num; q++){
                                                                            for(int r = 0; r<num; r++){
                                                                                for(int s = 0; s<num; s++){
                                                                                    for(int t = 0; t<num; t++){
                                                                                        val = val.add(BigInteger.ONE);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return val;
    }
}
