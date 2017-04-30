package com.robertkoszewski.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.robertkoszewski.dsl.services.QuickUIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuickUIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "':'", "'.'", "'Main'", "'{'", "'Menu'", "'}'", "'Content'", "'Row'", "'Label'", "'Disabled'", "'if'", "'is'", "'not'", "'and'", "'empty'", "'checked'", "'Checked'", "'OnClick'", "'Filter'", "'TODO'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQuickUIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuickUIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuickUIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuickUI.g"; }



     	private QuickUIGrammarAccess grammarAccess;

        public InternalQuickUIParser(TokenStream input, QuickUIGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UIModel";
       	}

       	@Override
       	protected QuickUIGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUIModel"
    // InternalQuickUI.g:64:1: entryRuleUIModel returns [EObject current=null] : iv_ruleUIModel= ruleUIModel EOF ;
    public final EObject entryRuleUIModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIModel = null;


        try {
            // InternalQuickUI.g:64:48: (iv_ruleUIModel= ruleUIModel EOF )
            // InternalQuickUI.g:65:2: iv_ruleUIModel= ruleUIModel EOF
            {
             newCompositeNode(grammarAccess.getUIModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIModel=ruleUIModel();

            state._fsp--;

             current =iv_ruleUIModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUIModel"


    // $ANTLR start "ruleUIModel"
    // InternalQuickUI.g:71:1: ruleUIModel returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAlias ) )* ( (lv_window_1_0= ruleWindow ) )+ ) ;
    public final EObject ruleUIModel() throws RecognitionException {
        EObject current = null;

        EObject lv_alias_0_0 = null;

        EObject lv_window_1_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:77:2: ( ( ( (lv_alias_0_0= ruleAlias ) )* ( (lv_window_1_0= ruleWindow ) )+ ) )
            // InternalQuickUI.g:78:2: ( ( (lv_alias_0_0= ruleAlias ) )* ( (lv_window_1_0= ruleWindow ) )+ )
            {
            // InternalQuickUI.g:78:2: ( ( (lv_alias_0_0= ruleAlias ) )* ( (lv_window_1_0= ruleWindow ) )+ )
            // InternalQuickUI.g:79:3: ( (lv_alias_0_0= ruleAlias ) )* ( (lv_window_1_0= ruleWindow ) )+
            {
            // InternalQuickUI.g:79:3: ( (lv_alias_0_0= ruleAlias ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQuickUI.g:80:4: (lv_alias_0_0= ruleAlias )
            	    {
            	    // InternalQuickUI.g:80:4: (lv_alias_0_0= ruleAlias )
            	    // InternalQuickUI.g:81:5: lv_alias_0_0= ruleAlias
            	    {

            	    					newCompositeNode(grammarAccess.getUIModelAccess().getAliasAliasParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_alias_0_0=ruleAlias();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUIModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"alias",
            	    						lv_alias_0_0,
            	    						"com.robertkoszewski.dsl.QuickUI.Alias");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalQuickUI.g:98:3: ( (lv_window_1_0= ruleWindow ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalQuickUI.g:99:4: (lv_window_1_0= ruleWindow )
            	    {
            	    // InternalQuickUI.g:99:4: (lv_window_1_0= ruleWindow )
            	    // InternalQuickUI.g:100:5: lv_window_1_0= ruleWindow
            	    {

            	    					newCompositeNode(grammarAccess.getUIModelAccess().getWindowWindowParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_window_1_0=ruleWindow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUIModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"window",
            	    						lv_window_1_0,
            	    						"com.robertkoszewski.dsl.QuickUI.Window");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUIModel"


    // $ANTLR start "entryRuleAlias"
    // InternalQuickUI.g:121:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // InternalQuickUI.g:121:46: (iv_ruleAlias= ruleAlias EOF )
            // InternalQuickUI.g:122:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // InternalQuickUI.g:128:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_package_3_0= rulePackage ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_package_3_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:134:2: ( (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_package_3_0= rulePackage ) ) ) )
            // InternalQuickUI.g:135:2: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_package_3_0= rulePackage ) ) )
            {
            // InternalQuickUI.g:135:2: (otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_package_3_0= rulePackage ) ) )
            // InternalQuickUI.g:136:3: otherlv_0= 'use' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_package_3_0= rulePackage ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getUseKeyword_0());
            		
            // InternalQuickUI.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQuickUI.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQuickUI.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalQuickUI.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAliasAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAliasRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAliasAccess().getColonKeyword_2());
            		
            // InternalQuickUI.g:162:3: ( (lv_package_3_0= rulePackage ) )
            // InternalQuickUI.g:163:4: (lv_package_3_0= rulePackage )
            {
            // InternalQuickUI.g:163:4: (lv_package_3_0= rulePackage )
            // InternalQuickUI.g:164:5: lv_package_3_0= rulePackage
            {

            					newCompositeNode(grammarAccess.getAliasAccess().getPackagePackageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_package_3_0=rulePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAliasRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_3_0,
            						"com.robertkoszewski.dsl.QuickUI.Package");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRulePackage"
    // InternalQuickUI.g:185:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalQuickUI.g:185:48: (iv_rulePackage= rulePackage EOF )
            // InternalQuickUI.g:186:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalQuickUI.g:192:1: rulePackage returns [EObject current=null] : ( ( (lv_pname_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subp_2_0= rulePackage ) ) )? ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_pname_0_0=null;
        Token otherlv_1=null;
        EObject lv_subp_2_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:198:2: ( ( ( (lv_pname_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subp_2_0= rulePackage ) ) )? ) )
            // InternalQuickUI.g:199:2: ( ( (lv_pname_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subp_2_0= rulePackage ) ) )? )
            {
            // InternalQuickUI.g:199:2: ( ( (lv_pname_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subp_2_0= rulePackage ) ) )? )
            // InternalQuickUI.g:200:3: ( (lv_pname_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_subp_2_0= rulePackage ) ) )?
            {
            // InternalQuickUI.g:200:3: ( (lv_pname_0_0= RULE_ID ) )
            // InternalQuickUI.g:201:4: (lv_pname_0_0= RULE_ID )
            {
            // InternalQuickUI.g:201:4: (lv_pname_0_0= RULE_ID )
            // InternalQuickUI.g:202:5: lv_pname_0_0= RULE_ID
            {
            lv_pname_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_pname_0_0, grammarAccess.getPackageAccess().getPnameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pname",
            						lv_pname_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQuickUI.g:218:3: (otherlv_1= '.' ( (lv_subp_2_0= rulePackage ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuickUI.g:219:4: otherlv_1= '.' ( (lv_subp_2_0= rulePackage ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getFullStopKeyword_1_0());
                    			
                    // InternalQuickUI.g:223:4: ( (lv_subp_2_0= rulePackage ) )
                    // InternalQuickUI.g:224:5: (lv_subp_2_0= rulePackage )
                    {
                    // InternalQuickUI.g:224:5: (lv_subp_2_0= rulePackage )
                    // InternalQuickUI.g:225:6: lv_subp_2_0= rulePackage
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getSubpPackageParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_subp_2_0=rulePackage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						set(
                    							current,
                    							"subp",
                    							lv_subp_2_0,
                    							"com.robertkoszewski.dsl.QuickUI.Package");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleWindow"
    // InternalQuickUI.g:247:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // InternalQuickUI.g:247:47: (iv_ruleWindow= ruleWindow EOF )
            // InternalQuickUI.g:248:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalQuickUI.g:254:1: ruleWindow returns [EObject current=null] : ( () ( ( (lv_main_1_0= 'Main' ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= '{' (otherlv_7= 'Menu' otherlv_8= '{' ( (lv_menu_elements_9_0= ruleElement ) )* otherlv_10= '}' )? (otherlv_11= 'Content' otherlv_12= '{' ( (lv_content_elements_13_0= ruleElement ) )* otherlv_14= '}' ) otherlv_15= '}' ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token lv_main_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_menu_elements_9_0 = null;

        EObject lv_content_elements_13_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:260:2: ( ( () ( ( (lv_main_1_0= 'Main' ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= '{' (otherlv_7= 'Menu' otherlv_8= '{' ( (lv_menu_elements_9_0= ruleElement ) )* otherlv_10= '}' )? (otherlv_11= 'Content' otherlv_12= '{' ( (lv_content_elements_13_0= ruleElement ) )* otherlv_14= '}' ) otherlv_15= '}' ) )
            // InternalQuickUI.g:261:2: ( () ( ( (lv_main_1_0= 'Main' ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= '{' (otherlv_7= 'Menu' otherlv_8= '{' ( (lv_menu_elements_9_0= ruleElement ) )* otherlv_10= '}' )? (otherlv_11= 'Content' otherlv_12= '{' ( (lv_content_elements_13_0= ruleElement ) )* otherlv_14= '}' ) otherlv_15= '}' )
            {
            // InternalQuickUI.g:261:2: ( () ( ( (lv_main_1_0= 'Main' ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= '{' (otherlv_7= 'Menu' otherlv_8= '{' ( (lv_menu_elements_9_0= ruleElement ) )* otherlv_10= '}' )? (otherlv_11= 'Content' otherlv_12= '{' ( (lv_content_elements_13_0= ruleElement ) )* otherlv_14= '}' ) otherlv_15= '}' )
            // InternalQuickUI.g:262:3: () ( ( (lv_main_1_0= 'Main' ) ) otherlv_2= ':' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )? otherlv_6= '{' (otherlv_7= 'Menu' otherlv_8= '{' ( (lv_menu_elements_9_0= ruleElement ) )* otherlv_10= '}' )? (otherlv_11= 'Content' otherlv_12= '{' ( (lv_content_elements_13_0= ruleElement ) )* otherlv_14= '}' ) otherlv_15= '}'
            {
            // InternalQuickUI.g:262:3: ()
            // InternalQuickUI.g:263:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowAccess().getWindowAction_0(),
            					current);
            			

            }

            // InternalQuickUI.g:269:3: ( ( (lv_main_1_0= 'Main' ) ) otherlv_2= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuickUI.g:270:4: ( (lv_main_1_0= 'Main' ) ) otherlv_2= ':'
                    {
                    // InternalQuickUI.g:270:4: ( (lv_main_1_0= 'Main' ) )
                    // InternalQuickUI.g:271:5: (lv_main_1_0= 'Main' )
                    {
                    // InternalQuickUI.g:271:5: (lv_main_1_0= 'Main' )
                    // InternalQuickUI.g:272:6: lv_main_1_0= 'Main'
                    {
                    lv_main_1_0=(Token)match(input,14,FOLLOW_6); 

                    						newLeafNode(lv_main_1_0, grammarAccess.getWindowAccess().getMainMainKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWindowRule());
                    						}
                    						setWithLastConsumed(current, "main", true, "Main");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuickUI.g:289:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalQuickUI.g:290:4: (lv_name_3_0= RULE_ID )
            {
            // InternalQuickUI.g:290:4: (lv_name_3_0= RULE_ID )
            // InternalQuickUI.g:291:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getWindowAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWindowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQuickUI.g:307:3: (otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQuickUI.g:308:4: otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getWindowAccess().getColonKeyword_3_0());
                    			
                    // InternalQuickUI.g:312:4: ( (lv_title_5_0= RULE_STRING ) )
                    // InternalQuickUI.g:313:5: (lv_title_5_0= RULE_STRING )
                    {
                    // InternalQuickUI.g:313:5: (lv_title_5_0= RULE_STRING )
                    // InternalQuickUI.g:314:6: lv_title_5_0= RULE_STRING
                    {
                    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_title_5_0, grammarAccess.getWindowAccess().getTitleSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWindowRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"title",
                    							lv_title_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalQuickUI.g:335:3: (otherlv_7= 'Menu' otherlv_8= '{' ( (lv_menu_elements_9_0= ruleElement ) )* otherlv_10= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQuickUI.g:336:4: otherlv_7= 'Menu' otherlv_8= '{' ( (lv_menu_elements_9_0= ruleElement ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getWindowAccess().getMenuKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalQuickUI.g:344:4: ( (lv_menu_elements_9_0= ruleElement ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalQuickUI.g:345:5: (lv_menu_elements_9_0= ruleElement )
                    	    {
                    	    // InternalQuickUI.g:345:5: (lv_menu_elements_9_0= ruleElement )
                    	    // InternalQuickUI.g:346:6: lv_menu_elements_9_0= ruleElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getWindowAccess().getMenu_elementsElementParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_menu_elements_9_0=ruleElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWindowRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"menu_elements",
                    	    							lv_menu_elements_9_0,
                    	    							"com.robertkoszewski.dsl.QuickUI.Element");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalQuickUI.g:368:3: (otherlv_11= 'Content' otherlv_12= '{' ( (lv_content_elements_13_0= ruleElement ) )* otherlv_14= '}' )
            // InternalQuickUI.g:369:4: otherlv_11= 'Content' otherlv_12= '{' ( (lv_content_elements_13_0= ruleElement ) )* otherlv_14= '}'
            {
            otherlv_11=(Token)match(input,18,FOLLOW_10); 

            				newLeafNode(otherlv_11, grammarAccess.getWindowAccess().getContentKeyword_6_0());
            			
            otherlv_12=(Token)match(input,15,FOLLOW_12); 

            				newLeafNode(otherlv_12, grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_6_1());
            			
            // InternalQuickUI.g:377:4: ( (lv_content_elements_13_0= ruleElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQuickUI.g:378:5: (lv_content_elements_13_0= ruleElement )
            	    {
            	    // InternalQuickUI.g:378:5: (lv_content_elements_13_0= ruleElement )
            	    // InternalQuickUI.g:379:6: lv_content_elements_13_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getWindowAccess().getContent_elementsElementParserRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_content_elements_13_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWindowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"content_elements",
            	    							lv_content_elements_13_0,
            	    							"com.robertkoszewski.dsl.QuickUI.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_14); 

            				newLeafNode(otherlv_14, grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_6_3());
            			

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleElement"
    // InternalQuickUI.g:409:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalQuickUI.g:409:48: (iv_ruleElement= ruleElement EOF )
            // InternalQuickUI.g:410:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalQuickUI.g:416:1: ruleElement returns [EObject current=null] : (this_Row_0= ruleRow | this_JavaElement_1= ruleJavaElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Row_0 = null;

        EObject this_JavaElement_1 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:422:2: ( (this_Row_0= ruleRow | this_JavaElement_1= ruleJavaElement ) )
            // InternalQuickUI.g:423:2: (this_Row_0= ruleRow | this_JavaElement_1= ruleJavaElement )
            {
            // InternalQuickUI.g:423:2: (this_Row_0= ruleRow | this_JavaElement_1= ruleJavaElement )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQuickUI.g:424:3: this_Row_0= ruleRow
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRowParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Row_0=ruleRow();

                    state._fsp--;


                    			current = this_Row_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:433:3: this_JavaElement_1= ruleJavaElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getJavaElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JavaElement_1=ruleJavaElement();

                    state._fsp--;


                    			current = this_JavaElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleJavaElement"
    // InternalQuickUI.g:445:1: entryRuleJavaElement returns [EObject current=null] : iv_ruleJavaElement= ruleJavaElement EOF ;
    public final EObject entryRuleJavaElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaElement = null;


        try {
            // InternalQuickUI.g:445:52: (iv_ruleJavaElement= ruleJavaElement EOF )
            // InternalQuickUI.g:446:2: iv_ruleJavaElement= ruleJavaElement EOF
            {
             newCompositeNode(grammarAccess.getJavaElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaElement=ruleJavaElement();

            state._fsp--;

             current =iv_ruleJavaElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaElement"


    // $ANTLR start "ruleJavaElement"
    // InternalQuickUI.g:452:1: ruleJavaElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleJavaElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subelement_4_1 = null;

        EObject lv_subelement_4_2 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:458:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )* otherlv_5= '}' ) )
            // InternalQuickUI.g:459:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )* otherlv_5= '}' )
            {
            // InternalQuickUI.g:459:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )* otherlv_5= '}' )
            // InternalQuickUI.g:460:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )* otherlv_5= '}'
            {
            // InternalQuickUI.g:460:3: ( (otherlv_0= RULE_ID ) )
            // InternalQuickUI.g:461:4: (otherlv_0= RULE_ID )
            {
            // InternalQuickUI.g:461:4: (otherlv_0= RULE_ID )
            // InternalQuickUI.g:462:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJavaElementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getJavaElementAccess().getAliasAliasCrossReference_0_0());
            				

            }


            }

            // InternalQuickUI.g:473:3: (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQuickUI.g:474:4: otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getJavaElementAccess().getColonKeyword_1_0());
                    			
                    // InternalQuickUI.g:478:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalQuickUI.g:479:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalQuickUI.g:479:5: (lv_name_2_0= RULE_ID )
                    // InternalQuickUI.g:480:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getJavaElementAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJavaElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getJavaElementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuickUI.g:501:3: ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=19 && LA12_0<=21)||(LA12_0>=28 && LA12_0<=30)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQuickUI.g:502:4: ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) )
            	    {
            	    // InternalQuickUI.g:502:4: ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) )
            	    // InternalQuickUI.g:503:5: (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption )
            	    {
            	    // InternalQuickUI.g:503:5: (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_ID||LA11_0==19) ) {
            	        alt11=1;
            	    }
            	    else if ( ((LA11_0>=20 && LA11_0<=21)||(LA11_0>=28 && LA11_0<=30)) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalQuickUI.g:504:6: lv_subelement_4_1= ruleElement
            	            {

            	            						newCompositeNode(grammarAccess.getJavaElementAccess().getSubelementElementParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_subelement_4_1=ruleElement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getJavaElementRule());
            	            						}
            	            						add(
            	            							current,
            	            							"subelement",
            	            							lv_subelement_4_1,
            	            							"com.robertkoszewski.dsl.QuickUI.Element");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalQuickUI.g:520:6: lv_subelement_4_2= ruleOption
            	            {

            	            						newCompositeNode(grammarAccess.getJavaElementAccess().getSubelementOptionParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_subelement_4_2=ruleOption();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getJavaElementRule());
            	            						}
            	            						add(
            	            							current,
            	            							"subelement",
            	            							lv_subelement_4_2,
            	            							"com.robertkoszewski.dsl.QuickUI.Option");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJavaElementAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaElement"


    // $ANTLR start "entryRuleRow"
    // InternalQuickUI.g:546:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalQuickUI.g:546:44: (iv_ruleRow= ruleRow EOF )
            // InternalQuickUI.g:547:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalQuickUI.g:553:1: ruleRow returns [EObject current=null] : (otherlv_0= 'Row' (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )+ otherlv_5= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subelement_4_1 = null;

        EObject lv_subelement_4_2 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:559:2: ( (otherlv_0= 'Row' (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )+ otherlv_5= '}' ) )
            // InternalQuickUI.g:560:2: (otherlv_0= 'Row' (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )+ otherlv_5= '}' )
            {
            // InternalQuickUI.g:560:2: (otherlv_0= 'Row' (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )+ otherlv_5= '}' )
            // InternalQuickUI.g:561:3: otherlv_0= 'Row' (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )? otherlv_3= '{' ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            // InternalQuickUI.g:565:3: (otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQuickUI.g:566:4: otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getRowAccess().getColonKeyword_1_0());
                    			
                    // InternalQuickUI.g:570:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalQuickUI.g:571:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalQuickUI.g:571:5: (lv_name_2_0= RULE_ID )
                    // InternalQuickUI.g:572:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getRowAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRowRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuickUI.g:593:3: ( ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=19 && LA15_0<=21)||(LA15_0>=28 && LA15_0<=30)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQuickUI.g:594:4: ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) )
            	    {
            	    // InternalQuickUI.g:594:4: ( (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption ) )
            	    // InternalQuickUI.g:595:5: (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption )
            	    {
            	    // InternalQuickUI.g:595:5: (lv_subelement_4_1= ruleElement | lv_subelement_4_2= ruleOption )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_ID||LA14_0==19) ) {
            	        alt14=1;
            	    }
            	    else if ( ((LA14_0>=20 && LA14_0<=21)||(LA14_0>=28 && LA14_0<=30)) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalQuickUI.g:596:6: lv_subelement_4_1= ruleElement
            	            {

            	            						newCompositeNode(grammarAccess.getRowAccess().getSubelementElementParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_subelement_4_1=ruleElement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getRowRule());
            	            						}
            	            						add(
            	            							current,
            	            							"subelement",
            	            							lv_subelement_4_1,
            	            							"com.robertkoszewski.dsl.QuickUI.Element");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalQuickUI.g:612:6: lv_subelement_4_2= ruleOption
            	            {

            	            						newCompositeNode(grammarAccess.getRowAccess().getSubelementOptionParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_subelement_4_2=ruleOption();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getRowRule());
            	            						}
            	            						add(
            	            							current,
            	            							"subelement",
            	            							lv_subelement_4_2,
            	            							"com.robertkoszewski.dsl.QuickUI.Option");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleOption"
    // InternalQuickUI.g:638:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalQuickUI.g:638:47: (iv_ruleOption= ruleOption EOF )
            // InternalQuickUI.g:639:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalQuickUI.g:645:1: ruleOption returns [EObject current=null] : (this_Label_0= ruleLabel | this_Disabled_1= ruleDisabled | this_Checked_2= ruleChecked | this_OnClick_3= ruleOnClick | ( () ruleFilter ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_Disabled_1 = null;

        EObject this_Checked_2 = null;

        EObject this_OnClick_3 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:651:2: ( (this_Label_0= ruleLabel | this_Disabled_1= ruleDisabled | this_Checked_2= ruleChecked | this_OnClick_3= ruleOnClick | ( () ruleFilter ) ) )
            // InternalQuickUI.g:652:2: (this_Label_0= ruleLabel | this_Disabled_1= ruleDisabled | this_Checked_2= ruleChecked | this_OnClick_3= ruleOnClick | ( () ruleFilter ) )
            {
            // InternalQuickUI.g:652:2: (this_Label_0= ruleLabel | this_Disabled_1= ruleDisabled | this_Checked_2= ruleChecked | this_OnClick_3= ruleOnClick | ( () ruleFilter ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt16=1;
                }
                break;
            case 21:
                {
                alt16=2;
                }
                break;
            case 28:
                {
                alt16=3;
                }
                break;
            case 29:
                {
                alt16=4;
                }
                break;
            case 30:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalQuickUI.g:653:3: this_Label_0= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_0=ruleLabel();

                    state._fsp--;


                    			current = this_Label_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:662:3: this_Disabled_1= ruleDisabled
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getDisabledParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Disabled_1=ruleDisabled();

                    state._fsp--;


                    			current = this_Disabled_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQuickUI.g:671:3: this_Checked_2= ruleChecked
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getCheckedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Checked_2=ruleChecked();

                    state._fsp--;


                    			current = this_Checked_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQuickUI.g:680:3: this_OnClick_3= ruleOnClick
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getOnClickParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnClick_3=ruleOnClick();

                    state._fsp--;


                    			current = this_OnClick_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQuickUI.g:689:3: ( () ruleFilter )
                    {
                    // InternalQuickUI.g:689:3: ( () ruleFilter )
                    // InternalQuickUI.g:690:4: () ruleFilter
                    {
                    // InternalQuickUI.g:690:4: ()
                    // InternalQuickUI.g:691:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOptionAccess().getFilterAction_4_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getOptionAccess().getFilterParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleFilter();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleLabel"
    // InternalQuickUI.g:709:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalQuickUI.g:709:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalQuickUI.g:710:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalQuickUI.g:716:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalQuickUI.g:722:2: ( (otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalQuickUI.g:723:2: (otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalQuickUI.g:723:2: (otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalQuickUI.g:724:3: otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalQuickUI.g:732:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalQuickUI.g:733:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalQuickUI.g:733:4: (lv_value_2_0= RULE_STRING )
            // InternalQuickUI.g:734:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleDisabled"
    // InternalQuickUI.g:754:1: entryRuleDisabled returns [EObject current=null] : iv_ruleDisabled= ruleDisabled EOF ;
    public final EObject entryRuleDisabled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisabled = null;


        try {
            // InternalQuickUI.g:754:49: (iv_ruleDisabled= ruleDisabled EOF )
            // InternalQuickUI.g:755:2: iv_ruleDisabled= ruleDisabled EOF
            {
             newCompositeNode(grammarAccess.getDisabledRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisabled=ruleDisabled();

            state._fsp--;

             current =iv_ruleDisabled; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisabled"


    // $ANTLR start "ruleDisabled"
    // InternalQuickUI.g:761:1: ruleDisabled returns [EObject current=null] : (otherlv_0= 'Disabled' otherlv_1= ':' ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject ruleDisabled() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:767:2: ( (otherlv_0= 'Disabled' otherlv_1= ':' ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalQuickUI.g:768:2: (otherlv_0= 'Disabled' otherlv_1= ':' ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalQuickUI.g:768:2: (otherlv_0= 'Disabled' otherlv_1= ':' ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalQuickUI.g:769:3: otherlv_0= 'Disabled' otherlv_1= ':' ( (lv_condition_2_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDisabledAccess().getDisabledKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDisabledAccess().getColonKeyword_1());
            		
            // InternalQuickUI.g:777:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalQuickUI.g:778:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalQuickUI.g:778:4: (lv_condition_2_0= ruleCondition )
            // InternalQuickUI.g:779:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getDisabledAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisabledRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"com.robertkoszewski.dsl.QuickUI.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisabled"


    // $ANTLR start "entryRuleCondition"
    // InternalQuickUI.g:800:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalQuickUI.g:800:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalQuickUI.g:801:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalQuickUI.g:807:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) (otherlv_5= 'and' ( (lv_subcondition_6_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_negation_3_0=null;
        Token otherlv_5=null;
        EObject lv_condition_4_0 = null;

        EObject lv_subcondition_6_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:813:2: ( ( (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) (otherlv_5= 'and' ( (lv_subcondition_6_0= ruleCondition ) ) )? ) )
            // InternalQuickUI.g:814:2: ( (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) (otherlv_5= 'and' ( (lv_subcondition_6_0= ruleCondition ) ) )? )
            {
            // InternalQuickUI.g:814:2: ( (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) (otherlv_5= 'and' ( (lv_subcondition_6_0= ruleCondition ) ) )? )
            // InternalQuickUI.g:815:3: (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) (otherlv_5= 'and' ( (lv_subcondition_6_0= ruleCondition ) ) )?
            {
            // InternalQuickUI.g:815:3: (otherlv_0= 'if' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQuickUI.g:816:4: otherlv_0= 'if'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
                    			

                    }
                    break;

            }

            // InternalQuickUI.g:821:3: ( (otherlv_1= RULE_ID ) )
            // InternalQuickUI.g:822:4: (otherlv_1= RULE_ID )
            {
            // InternalQuickUI.g:822:4: (otherlv_1= RULE_ID )
            // InternalQuickUI.g:823:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getElementElementCrossReference_1_0());
            				

            }


            }

            // InternalQuickUI.g:834:3: (otherlv_2= 'is' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQuickUI.g:835:4: otherlv_2= 'is'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getIsKeyword_2());
                    			

                    }
                    break;

            }

            // InternalQuickUI.g:840:3: ( (lv_negation_3_0= 'not' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQuickUI.g:841:4: (lv_negation_3_0= 'not' )
                    {
                    // InternalQuickUI.g:841:4: (lv_negation_3_0= 'not' )
                    // InternalQuickUI.g:842:5: lv_negation_3_0= 'not'
                    {
                    lv_negation_3_0=(Token)match(input,24,FOLLOW_18); 

                    					newLeafNode(lv_negation_3_0, grammarAccess.getConditionAccess().getNegationNotKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionRule());
                    					}
                    					setWithLastConsumed(current, "negation", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQuickUI.g:854:3: ( (lv_condition_4_0= ruleConditionType ) )
            // InternalQuickUI.g:855:4: (lv_condition_4_0= ruleConditionType )
            {
            // InternalQuickUI.g:855:4: (lv_condition_4_0= ruleConditionType )
            // InternalQuickUI.g:856:5: lv_condition_4_0= ruleConditionType
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getConditionConditionTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_condition_4_0=ruleConditionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_4_0,
            						"com.robertkoszewski.dsl.QuickUI.ConditionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuickUI.g:873:3: (otherlv_5= 'and' ( (lv_subcondition_6_0= ruleCondition ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQuickUI.g:874:4: otherlv_5= 'and' ( (lv_subcondition_6_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getAndKeyword_5_0());
                    			
                    // InternalQuickUI.g:878:4: ( (lv_subcondition_6_0= ruleCondition ) )
                    // InternalQuickUI.g:879:5: (lv_subcondition_6_0= ruleCondition )
                    {
                    // InternalQuickUI.g:879:5: (lv_subcondition_6_0= ruleCondition )
                    // InternalQuickUI.g:880:6: lv_subcondition_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getSubconditionConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_subcondition_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"subcondition",
                    							lv_subcondition_6_0,
                    							"com.robertkoszewski.dsl.QuickUI.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionType"
    // InternalQuickUI.g:902:1: entryRuleConditionType returns [EObject current=null] : iv_ruleConditionType= ruleConditionType EOF ;
    public final EObject entryRuleConditionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionType = null;


        try {
            // InternalQuickUI.g:902:54: (iv_ruleConditionType= ruleConditionType EOF )
            // InternalQuickUI.g:903:2: iv_ruleConditionType= ruleConditionType EOF
            {
             newCompositeNode(grammarAccess.getConditionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionType=ruleConditionType();

            state._fsp--;

             current =iv_ruleConditionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionType"


    // $ANTLR start "ruleConditionType"
    // InternalQuickUI.g:909:1: ruleConditionType returns [EObject current=null] : ( ( () otherlv_1= 'empty' ) | ( () otherlv_3= 'checked' ) ) ;
    public final EObject ruleConditionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQuickUI.g:915:2: ( ( ( () otherlv_1= 'empty' ) | ( () otherlv_3= 'checked' ) ) )
            // InternalQuickUI.g:916:2: ( ( () otherlv_1= 'empty' ) | ( () otherlv_3= 'checked' ) )
            {
            // InternalQuickUI.g:916:2: ( ( () otherlv_1= 'empty' ) | ( () otherlv_3= 'checked' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            else if ( (LA21_0==27) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalQuickUI.g:917:3: ( () otherlv_1= 'empty' )
                    {
                    // InternalQuickUI.g:917:3: ( () otherlv_1= 'empty' )
                    // InternalQuickUI.g:918:4: () otherlv_1= 'empty'
                    {
                    // InternalQuickUI.g:918:4: ()
                    // InternalQuickUI.g:919:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionTypeAccess().getEmptyAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionTypeAccess().getEmptyKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:931:3: ( () otherlv_3= 'checked' )
                    {
                    // InternalQuickUI.g:931:3: ( () otherlv_3= 'checked' )
                    // InternalQuickUI.g:932:4: () otherlv_3= 'checked'
                    {
                    // InternalQuickUI.g:932:4: ()
                    // InternalQuickUI.g:933:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionTypeAccess().getCheckedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionTypeAccess().getCheckedKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "entryRuleChecked"
    // InternalQuickUI.g:948:1: entryRuleChecked returns [EObject current=null] : iv_ruleChecked= ruleChecked EOF ;
    public final EObject entryRuleChecked() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChecked = null;


        try {
            // InternalQuickUI.g:948:48: (iv_ruleChecked= ruleChecked EOF )
            // InternalQuickUI.g:949:2: iv_ruleChecked= ruleChecked EOF
            {
             newCompositeNode(grammarAccess.getCheckedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChecked=ruleChecked();

            state._fsp--;

             current =iv_ruleChecked; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChecked"


    // $ANTLR start "ruleChecked"
    // InternalQuickUI.g:955:1: ruleChecked returns [EObject current=null] : (otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) ) ) ;
    public final EObject ruleChecked() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_checked_2_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:961:2: ( (otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) ) ) )
            // InternalQuickUI.g:962:2: (otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) ) )
            {
            // InternalQuickUI.g:962:2: (otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) ) )
            // InternalQuickUI.g:963:3: otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckedAccess().getCheckedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckedAccess().getColonKeyword_1());
            		
            // InternalQuickUI.g:971:3: ( (lv_checked_2_0= ruleBoolean ) )
            // InternalQuickUI.g:972:4: (lv_checked_2_0= ruleBoolean )
            {
            // InternalQuickUI.g:972:4: (lv_checked_2_0= ruleBoolean )
            // InternalQuickUI.g:973:5: lv_checked_2_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getCheckedAccess().getCheckedBooleanParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_checked_2_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckedRule());
            					}
            					set(
            						current,
            						"checked",
            						lv_checked_2_0,
            						"com.robertkoszewski.dsl.QuickUI.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChecked"


    // $ANTLR start "entryRuleOnClick"
    // InternalQuickUI.g:994:1: entryRuleOnClick returns [EObject current=null] : iv_ruleOnClick= ruleOnClick EOF ;
    public final EObject entryRuleOnClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnClick = null;


        try {
            // InternalQuickUI.g:994:48: (iv_ruleOnClick= ruleOnClick EOF )
            // InternalQuickUI.g:995:2: iv_ruleOnClick= ruleOnClick EOF
            {
             newCompositeNode(grammarAccess.getOnClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnClick=ruleOnClick();

            state._fsp--;

             current =iv_ruleOnClick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnClick"


    // $ANTLR start "ruleOnClick"
    // InternalQuickUI.g:1001:1: ruleOnClick returns [EObject current=null] : (otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOnClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_callback_2_0=null;


        	enterRule();

        try {
            // InternalQuickUI.g:1007:2: ( (otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) ) ) )
            // InternalQuickUI.g:1008:2: (otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) ) )
            {
            // InternalQuickUI.g:1008:2: (otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) ) )
            // InternalQuickUI.g:1009:3: otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOnClickAccess().getOnClickKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOnClickAccess().getColonKeyword_1());
            		
            // InternalQuickUI.g:1017:3: ( (lv_callback_2_0= RULE_ID ) )
            // InternalQuickUI.g:1018:4: (lv_callback_2_0= RULE_ID )
            {
            // InternalQuickUI.g:1018:4: (lv_callback_2_0= RULE_ID )
            // InternalQuickUI.g:1019:5: lv_callback_2_0= RULE_ID
            {
            lv_callback_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_callback_2_0, grammarAccess.getOnClickAccess().getCallbackIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnClickRule());
            					}
            					setWithLastConsumed(
            						current,
            						"callback",
            						lv_callback_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnClick"


    // $ANTLR start "entryRuleFilter"
    // InternalQuickUI.g:1039:1: entryRuleFilter returns [String current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final String entryRuleFilter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilter = null;


        try {
            // InternalQuickUI.g:1039:46: (iv_ruleFilter= ruleFilter EOF )
            // InternalQuickUI.g:1040:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalQuickUI.g:1046:1: ruleFilter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Filter' kw= ':' this_FilterExpression_2= ruleFilterExpression ) ;
    public final AntlrDatatypeRuleToken ruleFilter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FilterExpression_2 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:1052:2: ( (kw= 'Filter' kw= ':' this_FilterExpression_2= ruleFilterExpression ) )
            // InternalQuickUI.g:1053:2: (kw= 'Filter' kw= ':' this_FilterExpression_2= ruleFilterExpression )
            {
            // InternalQuickUI.g:1053:2: (kw= 'Filter' kw= ':' this_FilterExpression_2= ruleFilterExpression )
            // InternalQuickUI.g:1054:3: kw= 'Filter' kw= ':' this_FilterExpression_2= ruleFilterExpression
            {
            kw=(Token)match(input,30,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_21); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFilterAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getFilterAccess().getFilterExpressionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_FilterExpression_2=ruleFilterExpression();

            state._fsp--;


            			current.merge(this_FilterExpression_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleFilterExpression"
    // InternalQuickUI.g:1078:1: entryRuleFilterExpression returns [String current=null] : iv_ruleFilterExpression= ruleFilterExpression EOF ;
    public final String entryRuleFilterExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFilterExpression = null;


        try {
            // InternalQuickUI.g:1078:56: (iv_ruleFilterExpression= ruleFilterExpression EOF )
            // InternalQuickUI.g:1079:2: iv_ruleFilterExpression= ruleFilterExpression EOF
            {
             newCompositeNode(grammarAccess.getFilterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterExpression=ruleFilterExpression();

            state._fsp--;

             current =iv_ruleFilterExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterExpression"


    // $ANTLR start "ruleFilterExpression"
    // InternalQuickUI.g:1085:1: ruleFilterExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TODO' ;
    public final AntlrDatatypeRuleToken ruleFilterExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQuickUI.g:1091:2: (kw= 'TODO' )
            // InternalQuickUI.g:1092:2: kw= 'TODO'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFilterExpressionAccess().getTODOKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterExpression"


    // $ANTLR start "entryRuleBoolean"
    // InternalQuickUI.g:1100:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalQuickUI.g:1100:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalQuickUI.g:1101:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalQuickUI.g:1107:1: ruleBoolean returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQuickUI.g:1113:2: ( ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalQuickUI.g:1114:2: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalQuickUI.g:1114:2: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalQuickUI.g:1115:3: () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalQuickUI.g:1115:3: ()
            // InternalQuickUI.g:1116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            // InternalQuickUI.g:1122:3: ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalQuickUI.g:1123:4: ( (lv_isTrue_1_0= 'true' ) )
                    {
                    // InternalQuickUI.g:1123:4: ( (lv_isTrue_1_0= 'true' ) )
                    // InternalQuickUI.g:1124:5: (lv_isTrue_1_0= 'true' )
                    {
                    // InternalQuickUI.g:1124:5: (lv_isTrue_1_0= 'true' )
                    // InternalQuickUI.g:1125:6: lv_isTrue_1_0= 'true'
                    {
                    lv_isTrue_1_0=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_isTrue_1_0, grammarAccess.getBooleanAccess().getIsTrueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanRule());
                    						}
                    						setWithLastConsumed(current, "isTrue", true, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:1138:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanAccess().getFalseKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000703A0010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000070380010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000D800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});

}