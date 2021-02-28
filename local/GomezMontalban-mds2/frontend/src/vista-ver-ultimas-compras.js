import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-ver-ultimas-compras`
 *
 * VistaVerUltimasCompras element.
 *
 * @customElement
 * @polymer
 */
class VistaVerUltimasCompras extends PolymerElement {

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
        return 'vista-ver-ultimas-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerUltimasCompras.is, VistaVerUltimasCompras);
