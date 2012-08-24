/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.chasen.tinysvm;

class TinySVMJNI {
  public final static native int LINEAR_get();
  public final static native int POLY_get();
  public final static native int NEURAL_get();
  public final static native int RBF_get();
  public final static native int ANOVA_get();
  public final static native int DOUBLE_FEATURE_get();
  public final static native int BINARY_FEATURE_get();
  public final static native int SVM_get();
  public final static native int SVR_get();
  public final static native int ONE_CLASS_get();
  public final static native int BaseExample_add__SWIG_0(long jarg1, BaseExample jarg1_, double jarg2, long jarg3);
  public final static native int BaseExample_add__SWIG_1(long jarg1, BaseExample jarg1_, double jarg2, String jarg3);
  public final static native int BaseExample_add__SWIG_2(long jarg1, BaseExample jarg1_, String jarg2);
  public final static native int BaseExample_set__SWIG_0(long jarg1, BaseExample jarg1_, int jarg2, double jarg3, long jarg4);
  public final static native int BaseExample_set__SWIG_1(long jarg1, BaseExample jarg1_, int jarg2, double jarg3, String jarg4);
  public final static native int BaseExample_set__SWIG_2(long jarg1, BaseExample jarg1_, int jarg2, String jarg3);
  public final static native int BaseExample_get__SWIG_0(long jarg1, BaseExample jarg1_, int jarg2, long jarg3, long jarg4);
  public final static native String BaseExample_get__SWIG_1(long jarg1, BaseExample jarg1_, int jarg2);
  public final static native int BaseExample_remove(long jarg1, BaseExample jarg1_, int jarg2);
  public final static native int BaseExample_clear(long jarg1, BaseExample jarg1_);
  public final static native int BaseExample_size(long jarg1, BaseExample jarg1_);
  public final static native int BaseExample_read__SWIG_0(long jarg1, BaseExample jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int BaseExample_read__SWIG_1(long jarg1, BaseExample jarg1_, String jarg2, String jarg3);
  public final static native int BaseExample_read__SWIG_2(long jarg1, BaseExample jarg1_, String jarg2);
  public final static native int BaseExample_write__SWIG_0(long jarg1, BaseExample jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int BaseExample_write__SWIG_1(long jarg1, BaseExample jarg1_, String jarg2, String jarg3);
  public final static native int BaseExample_write__SWIG_2(long jarg1, BaseExample jarg1_, String jarg2);
  public final static native String BaseExample_readLine(long jarg1, BaseExample jarg1_, long jarg2);
  public final static native int BaseExample_readSVindex__SWIG_0(long jarg1, BaseExample jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int BaseExample_readSVindex__SWIG_1(long jarg1, BaseExample jarg1_, String jarg2, String jarg3);
  public final static native int BaseExample_readSVindex__SWIG_2(long jarg1, BaseExample jarg1_, String jarg2);
  public final static native int BaseExample_writeSVindex__SWIG_0(long jarg1, BaseExample jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int BaseExample_writeSVindex__SWIG_1(long jarg1, BaseExample jarg1_, String jarg2, String jarg3);
  public final static native int BaseExample_writeSVindex__SWIG_2(long jarg1, BaseExample jarg1_, String jarg2);
  public final static native void delete_BaseExample(long jarg1);
  public final static native double BaseExample_getY(long jarg1, BaseExample jarg1_, int jarg2);
  public final static native String BaseExample_getX(long jarg1, BaseExample jarg1_, int jarg2);
  public final static native double BaseExample_getAlpha(long jarg1, BaseExample jarg1_, int jarg2);
  public final static native double BaseExample_getGradient(long jarg1, BaseExample jarg1_, int jarg2);
  public final static native double BaseExample_getG(long jarg1, BaseExample jarg1_, int jarg2);
  public final static native int Model_read__SWIG_0(long jarg1, Model jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int Model_read__SWIG_1(long jarg1, Model jarg1_, String jarg2, String jarg3);
  public final static native int Model_read__SWIG_2(long jarg1, Model jarg1_, String jarg2);
  public final static native int Model_write__SWIG_0(long jarg1, Model jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int Model_write__SWIG_1(long jarg1, Model jarg1_, String jarg2, String jarg3);
  public final static native int Model_write__SWIG_2(long jarg1, Model jarg1_, String jarg2);
  public final static native int Model_clear(long jarg1, Model jarg1_);
  public final static native double Model_classify__SWIG_0(long jarg1, Model jarg1_, String jarg2);
  public final static native double Model_classify__SWIG_1(long jarg1, Model jarg1_, long jarg2);
  public final static native double Model_estimateMargin(long jarg1, Model jarg1_);
  public final static native double Model_estimateSphere(long jarg1, Model jarg1_);
  public final static native double Model_estimateVC(long jarg1, Model jarg1_);
  public final static native double Model_estimateXA__SWIG_0(long jarg1, Model jarg1_, double jarg2);
  public final static native double Model_estimateXA__SWIG_1(long jarg1, Model jarg1_);
  public final static native int Model_compress(long jarg1, Model jarg1_);
  public final static native int Model_getSVnum(long jarg1, Model jarg1_);
  public final static native int Model_getBSVnum(long jarg1, Model jarg1_);
  public final static native int Model_getTrainingDataSize(long jarg1, Model jarg1_);
  public final static native double Model_getLoss(long jarg1, Model jarg1_);
  public final static native long new_Model__SWIG_0();
  public final static native long new_Model__SWIG_1(long jarg1);
  public final static native void delete_Model(long jarg1);
  public final static native int Example_read__SWIG_0(long jarg1, Example jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int Example_read__SWIG_1(long jarg1, Example jarg1_, String jarg2, String jarg3);
  public final static native int Example_read__SWIG_2(long jarg1, Example jarg1_, String jarg2);
  public final static native int Example_write__SWIG_0(long jarg1, Example jarg1_, String jarg2, String jarg3, int jarg4);
  public final static native int Example_write__SWIG_1(long jarg1, Example jarg1_, String jarg2, String jarg3);
  public final static native int Example_write__SWIG_2(long jarg1, Example jarg1_, String jarg2);
  public final static native int Example_rebuildSVindex(long jarg1, Example jarg1_, long jarg2, Model jarg2_);
  public final static native long new_Example();
  public final static native void delete_Example(long jarg1);
  public final static native long Example_learn__SWIG_0(long jarg1, Example jarg1_, long jarg2);
  public final static native long Example_learn__SWIG_1(long jarg1, Example jarg1_, String jarg2);
  public final static native long Example_learn__SWIG_2(long jarg1, Example jarg1_);
  public final static native long SWIGModelUpcast(long jarg1);
  public final static native long SWIGExampleUpcast(long jarg1);
}