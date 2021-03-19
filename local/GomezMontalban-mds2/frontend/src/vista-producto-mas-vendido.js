import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaProductoMasVendido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="height: 100%; width: 100%; border: #ccc solid 2px; border-radius : 20px; background : #efefef;">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; height: 15%; justify-content: center; width: 15%; align-items: center; margin-left: var(--lumo-space-xl);"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 80%; justify-content: space-between; width: 100%; align-self: center;">
  <vaadin-vertical-layout theme="spacing" style="height: 10%; width: 100%; align-items: stretch; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-wrap: wrap; justify-content: flex-start; flex-grow: 0; width: 95%; align-self: center;">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; margin-left: var(--lumo-space-xl); justify-content: flex-start;">
     <p style="flex-grow: 0; flex-shrink: 0;">Paragraph</p>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; flex-shrink: 0; flex-direction: column; justify-content: center; align-items: center; margin-right: var(--lumo-space-xl); height: 70%;">
   <p style="margin-top: var(--lumo-space-xl); width: 90%; height: 90%; background : white;">Paragraph</p>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; align-items: stretch; width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; flex-grow: 0; justify-content: space-around;">
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; width: 73%;">
     <p style="flex-grow: 0;">Paragraph</p>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; flex-wrap: wrap-reverse; margin-right: var(--lumo-space-xl); padding-right: var(--lumo-space-xl);"></vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-producto-mas-vendido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoMasVendido.is, VistaProductoMasVendido);
