import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-ver-ficha`
 *
 * VistaVerFicha element.
 *
 * @customElement
 * @polymer
 */
class VistaVerFicha extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
