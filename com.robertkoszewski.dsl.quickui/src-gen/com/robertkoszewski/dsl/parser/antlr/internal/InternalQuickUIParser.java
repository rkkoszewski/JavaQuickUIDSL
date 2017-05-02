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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use'", "':'", "'.'", "'Main'", "'{'", "'Menu'", "'}'", "'Content'", "'Row'", "'Label'", "'Enabled'", "'or'", "'and'", "'if'", "'is'", "'not'", "'empty'", "'checked'", "'Checked'", "'OnClick'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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

                if ( (LA12_0==RULE_ID||(LA12_0>=19 && LA12_0<=21)||(LA12_0>=29 && LA12_0<=30)) ) {
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
            	    else if ( ((LA11_0>=20 && LA11_0<=21)||(LA11_0>=29 && LA11_0<=30)) ) {
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

                if ( (LA15_0==RULE_ID||(LA15_0>=19 && LA15_0<=21)||(LA15_0>=29 && LA15_0<=30)) ) {
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
            	    else if ( ((LA14_0>=20 && LA14_0<=21)||(LA14_0>=29 && LA14_0<=30)) ) {
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
    // InternalQuickUI.g:645:1: ruleOption returns [EObject current=null] : (this_Label_0= ruleLabel | this_Enabled_1= ruleEnabled | this_Checked_2= ruleChecked | this_OnClick_3= ruleOnClick ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_Enabled_1 = null;

        EObject this_Checked_2 = null;

        EObject this_OnClick_3 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:651:2: ( (this_Label_0= ruleLabel | this_Enabled_1= ruleEnabled | this_Checked_2= ruleChecked | this_OnClick_3= ruleOnClick ) )
            // InternalQuickUI.g:652:2: (this_Label_0= ruleLabel | this_Enabled_1= ruleEnabled | this_Checked_2= ruleChecked | this_OnClick_3= ruleOnClick )
            {
            // InternalQuickUI.g:652:2: (this_Label_0= ruleLabel | this_Enabled_1= ruleEnabled | this_Checked_2= ruleChecked | this_OnClick_3= ruleOnClick )
            int alt16=4;
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
            case 29:
                {
                alt16=3;
                }
                break;
            case 30:
                {
                alt16=4;
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
                    // InternalQuickUI.g:662:3: this_Enabled_1= ruleEnabled
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getEnabledParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enabled_1=ruleEnabled();

                    state._fsp--;


                    			current = this_Enabled_1;
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
    // InternalQuickUI.g:692:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalQuickUI.g:692:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalQuickUI.g:693:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalQuickUI.g:699:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalQuickUI.g:705:2: ( (otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalQuickUI.g:706:2: (otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalQuickUI.g:706:2: (otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalQuickUI.g:707:3: otherlv_0= 'Label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalQuickUI.g:715:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalQuickUI.g:716:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalQuickUI.g:716:4: (lv_value_2_0= RULE_STRING )
            // InternalQuickUI.g:717:5: lv_value_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleEnabled"
    // InternalQuickUI.g:737:1: entryRuleEnabled returns [EObject current=null] : iv_ruleEnabled= ruleEnabled EOF ;
    public final EObject entryRuleEnabled() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnabled = null;


        try {
            // InternalQuickUI.g:737:48: (iv_ruleEnabled= ruleEnabled EOF )
            // InternalQuickUI.g:738:2: iv_ruleEnabled= ruleEnabled EOF
            {
             newCompositeNode(grammarAccess.getEnabledRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnabled=ruleEnabled();

            state._fsp--;

             current =iv_ruleEnabled; 
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
    // $ANTLR end "entryRuleEnabled"


    // $ANTLR start "ruleEnabled"
    // InternalQuickUI.g:744:1: ruleEnabled returns [EObject current=null] : (otherlv_0= 'Enabled' otherlv_1= ':' ( (lv_condition_2_0= ruleConditionBranch ) ) ) ;
    public final EObject ruleEnabled() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:750:2: ( (otherlv_0= 'Enabled' otherlv_1= ':' ( (lv_condition_2_0= ruleConditionBranch ) ) ) )
            // InternalQuickUI.g:751:2: (otherlv_0= 'Enabled' otherlv_1= ':' ( (lv_condition_2_0= ruleConditionBranch ) ) )
            {
            // InternalQuickUI.g:751:2: (otherlv_0= 'Enabled' otherlv_1= ':' ( (lv_condition_2_0= ruleConditionBranch ) ) )
            // InternalQuickUI.g:752:3: otherlv_0= 'Enabled' otherlv_1= ':' ( (lv_condition_2_0= ruleConditionBranch ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEnabledAccess().getEnabledKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEnabledAccess().getColonKeyword_1());
            		
            // InternalQuickUI.g:760:3: ( (lv_condition_2_0= ruleConditionBranch ) )
            // InternalQuickUI.g:761:4: (lv_condition_2_0= ruleConditionBranch )
            {
            // InternalQuickUI.g:761:4: (lv_condition_2_0= ruleConditionBranch )
            // InternalQuickUI.g:762:5: lv_condition_2_0= ruleConditionBranch
            {

            					newCompositeNode(grammarAccess.getEnabledAccess().getConditionConditionBranchParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleConditionBranch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnabledRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"com.robertkoszewski.dsl.QuickUI.ConditionBranch");
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
    // $ANTLR end "ruleEnabled"


    // $ANTLR start "entryRuleConditionBranch"
    // InternalQuickUI.g:783:1: entryRuleConditionBranch returns [EObject current=null] : iv_ruleConditionBranch= ruleConditionBranch EOF ;
    public final EObject entryRuleConditionBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionBranch = null;


        try {
            // InternalQuickUI.g:783:56: (iv_ruleConditionBranch= ruleConditionBranch EOF )
            // InternalQuickUI.g:784:2: iv_ruleConditionBranch= ruleConditionBranch EOF
            {
             newCompositeNode(grammarAccess.getConditionBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionBranch=ruleConditionBranch();

            state._fsp--;

             current =iv_ruleConditionBranch; 
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
    // $ANTLR end "entryRuleConditionBranch"


    // $ANTLR start "ruleConditionBranch"
    // InternalQuickUI.g:790:1: ruleConditionBranch returns [EObject current=null] : (this_ConditionConcatenation_0= ruleConditionConcatenation ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConditionConcatenation ) ) )* ) ;
    public final EObject ruleConditionBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConditionConcatenation_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:796:2: ( (this_ConditionConcatenation_0= ruleConditionConcatenation ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConditionConcatenation ) ) )* ) )
            // InternalQuickUI.g:797:2: (this_ConditionConcatenation_0= ruleConditionConcatenation ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConditionConcatenation ) ) )* )
            {
            // InternalQuickUI.g:797:2: (this_ConditionConcatenation_0= ruleConditionConcatenation ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConditionConcatenation ) ) )* )
            // InternalQuickUI.g:798:3: this_ConditionConcatenation_0= ruleConditionConcatenation ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConditionConcatenation ) ) )*
            {

            			newCompositeNode(grammarAccess.getConditionBranchAccess().getConditionConcatenationParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_ConditionConcatenation_0=ruleConditionConcatenation();

            state._fsp--;


            			current = this_ConditionConcatenation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQuickUI.g:806:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleConditionConcatenation ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQuickUI.g:807:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleConditionConcatenation ) )
            	    {
            	    // InternalQuickUI.g:807:4: ()
            	    // InternalQuickUI.g:808:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConditionBranchAccess().getConditionBranchLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionBranchAccess().getOrKeyword_1_1());
            	    			
            	    // InternalQuickUI.g:818:4: ( (lv_right_3_0= ruleConditionConcatenation ) )
            	    // InternalQuickUI.g:819:5: (lv_right_3_0= ruleConditionConcatenation )
            	    {
            	    // InternalQuickUI.g:819:5: (lv_right_3_0= ruleConditionConcatenation )
            	    // InternalQuickUI.g:820:6: lv_right_3_0= ruleConditionConcatenation
            	    {

            	    						newCompositeNode(grammarAccess.getConditionBranchAccess().getRightConditionConcatenationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleConditionConcatenation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionBranchRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.robertkoszewski.dsl.QuickUI.ConditionConcatenation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
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
    // $ANTLR end "ruleConditionBranch"


    // $ANTLR start "entryRuleConditionConcatenation"
    // InternalQuickUI.g:842:1: entryRuleConditionConcatenation returns [EObject current=null] : iv_ruleConditionConcatenation= ruleConditionConcatenation EOF ;
    public final EObject entryRuleConditionConcatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionConcatenation = null;


        try {
            // InternalQuickUI.g:842:63: (iv_ruleConditionConcatenation= ruleConditionConcatenation EOF )
            // InternalQuickUI.g:843:2: iv_ruleConditionConcatenation= ruleConditionConcatenation EOF
            {
             newCompositeNode(grammarAccess.getConditionConcatenationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionConcatenation=ruleConditionConcatenation();

            state._fsp--;

             current =iv_ruleConditionConcatenation; 
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
    // $ANTLR end "entryRuleConditionConcatenation"


    // $ANTLR start "ruleConditionConcatenation"
    // InternalQuickUI.g:849:1: ruleConditionConcatenation returns [EObject current=null] : (this_Condition_0= ruleCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConditionValue ) ) )* ) ;
    public final EObject ruleConditionConcatenation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Condition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:855:2: ( (this_Condition_0= ruleCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConditionValue ) ) )* ) )
            // InternalQuickUI.g:856:2: (this_Condition_0= ruleCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConditionValue ) ) )* )
            {
            // InternalQuickUI.g:856:2: (this_Condition_0= ruleCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConditionValue ) ) )* )
            // InternalQuickUI.g:857:3: this_Condition_0= ruleCondition ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConditionValue ) ) )*
            {

            			newCompositeNode(grammarAccess.getConditionConcatenationAccess().getConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Condition_0=ruleCondition();

            state._fsp--;


            			current = this_Condition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalQuickUI.g:865:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConditionValue ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQuickUI.g:866:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleConditionValue ) )
            	    {
            	    // InternalQuickUI.g:866:4: ()
            	    // InternalQuickUI.g:867:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConditionConcatenationAccess().getConditionConcatenationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConditionConcatenationAccess().getAndKeyword_1_1());
            	    			
            	    // InternalQuickUI.g:877:4: ( (lv_right_3_0= ruleConditionValue ) )
            	    // InternalQuickUI.g:878:5: (lv_right_3_0= ruleConditionValue )
            	    {
            	    // InternalQuickUI.g:878:5: (lv_right_3_0= ruleConditionValue )
            	    // InternalQuickUI.g:879:6: lv_right_3_0= ruleConditionValue
            	    {

            	    						newCompositeNode(grammarAccess.getConditionConcatenationAccess().getRightConditionValueParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleConditionValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionConcatenationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.robertkoszewski.dsl.QuickUI.ConditionValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
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
    // $ANTLR end "ruleConditionConcatenation"


    // $ANTLR start "entryRuleConditionValue"
    // InternalQuickUI.g:901:1: entryRuleConditionValue returns [EObject current=null] : iv_ruleConditionValue= ruleConditionValue EOF ;
    public final EObject entryRuleConditionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionValue = null;


        try {
            // InternalQuickUI.g:901:55: (iv_ruleConditionValue= ruleConditionValue EOF )
            // InternalQuickUI.g:902:2: iv_ruleConditionValue= ruleConditionValue EOF
            {
             newCompositeNode(grammarAccess.getConditionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionValue=ruleConditionValue();

            state._fsp--;

             current =iv_ruleConditionValue; 
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
    // $ANTLR end "entryRuleConditionValue"


    // $ANTLR start "ruleConditionValue"
    // InternalQuickUI.g:908:1: ruleConditionValue returns [EObject current=null] : this_Condition_0= ruleCondition ;
    public final EObject ruleConditionValue() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:914:2: (this_Condition_0= ruleCondition )
            // InternalQuickUI.g:915:2: this_Condition_0= ruleCondition
            {

            		newCompositeNode(grammarAccess.getConditionValueAccess().getConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Condition_0=ruleCondition();

            state._fsp--;


            		current = this_Condition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleConditionValue"


    // $ANTLR start "entryRuleCondition"
    // InternalQuickUI.g:926:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalQuickUI.g:926:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalQuickUI.g:927:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalQuickUI.g:933:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_negation_3_0=null;
        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:939:2: ( ( (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) ) )
            // InternalQuickUI.g:940:2: ( (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) )
            {
            // InternalQuickUI.g:940:2: ( (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) ) )
            // InternalQuickUI.g:941:3: (otherlv_0= 'if' )? ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'is' )? ( (lv_negation_3_0= 'not' ) )? ( (lv_condition_4_0= ruleConditionType ) )
            {
            // InternalQuickUI.g:941:3: (otherlv_0= 'if' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQuickUI.g:942:4: otherlv_0= 'if'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getIfKeyword_0());
                    			

                    }
                    break;

            }

            // InternalQuickUI.g:947:3: ( (otherlv_1= RULE_ID ) )
            // InternalQuickUI.g:948:4: (otherlv_1= RULE_ID )
            {
            // InternalQuickUI.g:948:4: (otherlv_1= RULE_ID )
            // InternalQuickUI.g:949:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getElementElementCrossReference_1_0());
            				

            }


            }

            // InternalQuickUI.g:960:3: (otherlv_2= 'is' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQuickUI.g:961:4: otherlv_2= 'is'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getIsKeyword_2());
                    			

                    }
                    break;

            }

            // InternalQuickUI.g:966:3: ( (lv_negation_3_0= 'not' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQuickUI.g:967:4: (lv_negation_3_0= 'not' )
                    {
                    // InternalQuickUI.g:967:4: (lv_negation_3_0= 'not' )
                    // InternalQuickUI.g:968:5: lv_negation_3_0= 'not'
                    {
                    lv_negation_3_0=(Token)match(input,26,FOLLOW_20); 

                    					newLeafNode(lv_negation_3_0, grammarAccess.getConditionAccess().getNegationNotKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionRule());
                    					}
                    					setWithLastConsumed(current, "negation", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQuickUI.g:980:3: ( (lv_condition_4_0= ruleConditionType ) )
            // InternalQuickUI.g:981:4: (lv_condition_4_0= ruleConditionType )
            {
            // InternalQuickUI.g:981:4: (lv_condition_4_0= ruleConditionType )
            // InternalQuickUI.g:982:5: lv_condition_4_0= ruleConditionType
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getConditionConditionTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalQuickUI.g:1003:1: entryRuleConditionType returns [EObject current=null] : iv_ruleConditionType= ruleConditionType EOF ;
    public final EObject entryRuleConditionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionType = null;


        try {
            // InternalQuickUI.g:1003:54: (iv_ruleConditionType= ruleConditionType EOF )
            // InternalQuickUI.g:1004:2: iv_ruleConditionType= ruleConditionType EOF
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
    // InternalQuickUI.g:1010:1: ruleConditionType returns [EObject current=null] : ( ( () otherlv_1= 'empty' ) | ( () otherlv_3= 'checked' ) ) ;
    public final EObject ruleConditionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQuickUI.g:1016:2: ( ( ( () otherlv_1= 'empty' ) | ( () otherlv_3= 'checked' ) ) )
            // InternalQuickUI.g:1017:2: ( ( () otherlv_1= 'empty' ) | ( () otherlv_3= 'checked' ) )
            {
            // InternalQuickUI.g:1017:2: ( ( () otherlv_1= 'empty' ) | ( () otherlv_3= 'checked' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            else if ( (LA22_0==28) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalQuickUI.g:1018:3: ( () otherlv_1= 'empty' )
                    {
                    // InternalQuickUI.g:1018:3: ( () otherlv_1= 'empty' )
                    // InternalQuickUI.g:1019:4: () otherlv_1= 'empty'
                    {
                    // InternalQuickUI.g:1019:4: ()
                    // InternalQuickUI.g:1020:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionTypeAccess().getEmptyAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionTypeAccess().getEmptyKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQuickUI.g:1032:3: ( () otherlv_3= 'checked' )
                    {
                    // InternalQuickUI.g:1032:3: ( () otherlv_3= 'checked' )
                    // InternalQuickUI.g:1033:4: () otherlv_3= 'checked'
                    {
                    // InternalQuickUI.g:1033:4: ()
                    // InternalQuickUI.g:1034:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionTypeAccess().getCheckedAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

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
    // InternalQuickUI.g:1049:1: entryRuleChecked returns [EObject current=null] : iv_ruleChecked= ruleChecked EOF ;
    public final EObject entryRuleChecked() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChecked = null;


        try {
            // InternalQuickUI.g:1049:48: (iv_ruleChecked= ruleChecked EOF )
            // InternalQuickUI.g:1050:2: iv_ruleChecked= ruleChecked EOF
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
    // InternalQuickUI.g:1056:1: ruleChecked returns [EObject current=null] : (otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) ) ) ;
    public final EObject ruleChecked() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_checked_2_0 = null;



        	enterRule();

        try {
            // InternalQuickUI.g:1062:2: ( (otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) ) ) )
            // InternalQuickUI.g:1063:2: (otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) ) )
            {
            // InternalQuickUI.g:1063:2: (otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) ) )
            // InternalQuickUI.g:1064:3: otherlv_0= 'Checked' otherlv_1= ':' ( (lv_checked_2_0= ruleBoolean ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckedAccess().getCheckedKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckedAccess().getColonKeyword_1());
            		
            // InternalQuickUI.g:1072:3: ( (lv_checked_2_0= ruleBoolean ) )
            // InternalQuickUI.g:1073:4: (lv_checked_2_0= ruleBoolean )
            {
            // InternalQuickUI.g:1073:4: (lv_checked_2_0= ruleBoolean )
            // InternalQuickUI.g:1074:5: lv_checked_2_0= ruleBoolean
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
    // InternalQuickUI.g:1095:1: entryRuleOnClick returns [EObject current=null] : iv_ruleOnClick= ruleOnClick EOF ;
    public final EObject entryRuleOnClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnClick = null;


        try {
            // InternalQuickUI.g:1095:48: (iv_ruleOnClick= ruleOnClick EOF )
            // InternalQuickUI.g:1096:2: iv_ruleOnClick= ruleOnClick EOF
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
    // InternalQuickUI.g:1102:1: ruleOnClick returns [EObject current=null] : (otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOnClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_callback_2_0=null;


        	enterRule();

        try {
            // InternalQuickUI.g:1108:2: ( (otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) ) ) )
            // InternalQuickUI.g:1109:2: (otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) ) )
            {
            // InternalQuickUI.g:1109:2: (otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) ) )
            // InternalQuickUI.g:1110:3: otherlv_0= 'OnClick' otherlv_1= ':' ( (lv_callback_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOnClickAccess().getOnClickKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOnClickAccess().getColonKeyword_1());
            		
            // InternalQuickUI.g:1118:3: ( (lv_callback_2_0= RULE_ID ) )
            // InternalQuickUI.g:1119:4: (lv_callback_2_0= RULE_ID )
            {
            // InternalQuickUI.g:1119:4: (lv_callback_2_0= RULE_ID )
            // InternalQuickUI.g:1120:5: lv_callback_2_0= RULE_ID
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


    // $ANTLR start "entryRuleBoolean"
    // InternalQuickUI.g:1140:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalQuickUI.g:1140:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalQuickUI.g:1141:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalQuickUI.g:1147:1: ruleBoolean returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalQuickUI.g:1153:2: ( ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalQuickUI.g:1154:2: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalQuickUI.g:1154:2: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalQuickUI.g:1155:3: () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalQuickUI.g:1155:3: ()
            // InternalQuickUI.g:1156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            // InternalQuickUI.g:1162:3: ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            else if ( (LA23_0==32) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalQuickUI.g:1163:4: ( (lv_isTrue_1_0= 'true' ) )
                    {
                    // InternalQuickUI.g:1163:4: ( (lv_isTrue_1_0= 'true' ) )
                    // InternalQuickUI.g:1164:5: (lv_isTrue_1_0= 'true' )
                    {
                    // InternalQuickUI.g:1164:5: (lv_isTrue_1_0= 'true' )
                    // InternalQuickUI.g:1165:6: lv_isTrue_1_0= 'true'
                    {
                    lv_isTrue_1_0=(Token)match(input,31,FOLLOW_2); 

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
                    // InternalQuickUI.g:1178:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_2); 

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000603A0010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000060380010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000000L});

}