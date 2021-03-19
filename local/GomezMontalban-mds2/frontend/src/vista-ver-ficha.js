import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select-text-field.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color: #ECF5F9;
  " id="vaadinVerticalLayout">
 <h1 style="align-self: center; color: #000000;background-color: #BBDFEF; border:0;">Ficha cliente</h1>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; flex-shrink: 0; align-items: center; margin: var(--lumo-space-m); justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center; margin: var(--lumo-space-xs); justify-content: center; align-items: center; flex-shrink: 0; flex-grow: 0; padding: var(--lumo-space-xs);">
   <label style="align-self: center; flex-grow: 1; margin-left: var(--lumo-space-m); margin-right: var(--lumo-space-m); padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-top: var(--lumo-space-m); margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); flex-shrink: 0; font-weight: bold;">ID CLIENTE : </label>
   <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0;">
    <vaadin-text-field style="margin-right: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); background-color: #D7E9F1; margin-top: var(--lumo-space-m); flex-shrink: 0; align-self: center; flex-grow: 1;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-xs); flex-shrink: 0; padding: var(--lumo-space-xs);">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
    <label style="align-self: center; padding-right: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m); padding-left: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m); margin-top: var(--lumo-space-m); padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); flex-shrink: 0; flex-grow: 1;font-weight: bold;">NOMBRE : </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; padding-right: var(--lumo-space-xl); flex-shrink: 0; align-items: center; justify-content: center;">
    <vaadin-text-field style="align-self: center; margin-right: var(--lumo-space-l); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); margin-top: var(--lumo-space-m); background-color: #D7E9F1; flex-shrink: 0; flex-grow: 1;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; margin: var(--lumo-space-xs); padding: var(--lumo-space-xs);">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; align-self: center;">
    <label style="padding: var(--lumo-space-m); margin-top: var(--lumo-space-m); flex-shrink: 0; align-self: center; padding-left: var(--lumo-space-xs); flex-grow: 1; margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m);font-weight: bold;">APELLIDOS :</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center; align-self: center;">
    <vaadin-select-text-field style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); align-self: center; flex-shrink: 0; background-color: #D7E9F1; flex-grow: 1;"></vaadin-select-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; margin: var(--lumo-space-xs); padding: var(--lumo-space-xs);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); padding: var(--lumo-space-m); padding-left: var(--lumo-space-xs); flex-shrink: 0; align-self: center; flex-grow: 1;font-weight: bold;">DIRECCION : </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-xl); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); align-self: center; flex-shrink: 0; background-color: #D7E9F1;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; margin: var(--lumo-space-xs); padding: var(--lumo-space-xs);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; align-self: center; padding: var(--lumo-space-m); padding-left: var(--lumo-space-xs); flex-grow: 1;font-weight: bold;">LOCALIDAD : </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="margin-right: var(--lumo-space-xl); margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; align-self: center; background-color: #D7E9F1;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; margin: var(--lumo-space-xs); padding: var(--lumo-space-xs);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; align-self: center; padding: var(--lumo-space-m); flex-grow: 1;font-weight: bold;">CALLE :</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); align-self: center; flex-shrink: 0; background-color: #D7E9F1; flex-grow: 1;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; margin: var(--lumo-space-xs); padding: var(--lumo-space-xs);">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; flex-grow: 1; align-items: center; justify-content: center;">
    <label style="margin-right: var(--lumo-space-m); margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); padding: var(--lumo-space-m); flex-shrink: 0; align-self: center;font-weight: bold;">PORTAL : </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="flex-shrink: 0; flex-grow: 1; align-self: center; margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); background-color: #D7E9F1;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; justify-content: center; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0;">
    <label style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-l); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 0; flex-grow: 0; font-weight: bold; width: 100%; height: 100%;">PROVINCIA :</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0;">
    <vaadin-text-field style="flex-shrink: 0; flex-grow: 0; background-color: #D7E9F1; margin-bottom: var(--lumo-space-m); margin-right: var(--lumo-space-xs); width: 100%; height: 100%;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="justify-content: center; margin-right: var(--lumo-space-xs); margin-bottom: var(--lumo-space-xs); margin-left: var(--lumo-space-xs); margin-top: var(--lumo-space-xs); flex-shrink: 0; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0;">
    <label style="margin-right: var(--lumo-space-xl); margin-top: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-xs); font-weight: bold; flex-shrink: 0; flex-grow: 0; width: 100%; height: 100%;">CODIGO POSTAL :</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="flex-shrink: 0; width: 88%;">
    <vaadin-text-field style="margin-top: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); background-color: #D7E9F1; flex-shrink: 0; flex-grow: 0; width: 100%; height: 100%;"></vaadin-text-field>
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
