import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaVerFicha extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;  " id="vaadinVerticalLayout">
 <h1 style="align-self: center; color: #000000;">Ficha cliente</h1>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; flex-shrink: 0; align-items: center; margin: var(--lumo-space-m); justify-content: center;">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: center; justify-content: center; align-items: center; flex-shrink: 0; flex-grow: 0;">
   <label style="align-self: center; flex-grow: 1; margin-left: var(--lumo-space-m); margin-right: var(--lumo-space-m); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-top: var(--lumo-space-m); margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); flex-shrink: 0; font-weight: bold;">ID CLIENTE : </label>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;">
    <vaadin-text-field style="margin-right: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); " id="textCliente" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-self: center; align-items: center; justify-content: center; flex-shrink: 0;">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
    <label style="align-self: center; padding-right: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m); padding-left: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m); margin-top: var(--lumo-space-m); padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); flex-shrink: 0; flex-grow: 1;font-weight: bold;">NOMBRE : </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; padding-right: var(--lumo-space-xl); flex-shrink: 0; align-items: center; justify-content: center;">
    <vaadin-text-field style="align-self: center; margin-right: var(--lumo-space-l); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); margin-top: var(--lumo-space-m); " id="textNombre" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-items: center;">
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); padding: var(--lumo-space-m); padding-left: var(--lumo-space-xs); flex-shrink: 0; align-self: center; flex-grow: 1;font-weight: bold;">País: </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); align-self: center; flex-shrink: 0; " id="textPais" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-items: center;">
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; align-self: center; padding: var(--lumo-space-m); padding-left: var(--lumo-space-xs); flex-grow: 1;font-weight: bold;">LOCALIDAD : </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="margin-right: var(--lumo-space-xl); margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; align-self: center; " id="textLocalidad" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; align-self: center; padding: var(--lumo-space-m); flex-grow: 1;font-weight: bold;">CALLE :</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); align-self: center; flex-shrink: 0; " id="textCalle" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="align-items: center; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; flex-grow: 1; align-items: center; justify-content: center;">
    <label style="margin-right: var(--lumo-space-m); margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); padding: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">PORTAL : </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="flex-shrink: 0; flex-grow: 1; align-self: center; margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m);" id="textPortal" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="flex-shrink: 0; align-items: center; align-self: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0;">
    <label style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-l); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; flex-grow: 0; font-weight: bold; width: 100%; height: 100%;">PROVINCIA :</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; align-self: center; align-items: center;">
    <vaadin-text-field style="flex-shrink: 0; flex-grow: 0; margin-bottom: var(--lumo-space-m); margin-right: var(--lumo-space-xs); align-self: center;" id="textProvincia" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="margin-right: var(--lumo-space-xs); margin-bottom: var(--lumo-space-xs); margin-left: var(--lumo-space-xs); margin-top: var(--lumo-space-xs); flex-shrink: 0; align-self: center;">
   <vaadin-horizontal-layout style="flex-shrink: 0; align-items: center;">
    <label style="margin-right: var(--lumo-space-xl); margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-xs); font-weight: bold; flex-shrink: 0; flex-grow: 0;">CODIGO POSTAL :</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="flex-shrink: 0; align-items: center;">
    <vaadin-text-field style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; flex-grow: 0;" id="textCodigoPostal" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-ver-ficha';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerFicha.is, VistaVerFicha);
